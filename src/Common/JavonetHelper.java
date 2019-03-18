package Common;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NObject;
import com.javonet.api.NType;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class JavonetHelper {

  public static Map<Class<?>, String> JavaToDotnetType = new HashMap<Class<?>, String>();

  static {
    JavaToDotnetType.put(java.lang.Boolean.class, "System.Boolean");
    JavaToDotnetType.put(java.lang.String.class, "System.String");
    JavaToDotnetType.put(java.lang.Character.class, "System.Char");
    JavaToDotnetType.put(java.lang.Byte.class, "System.Byte");
    JavaToDotnetType.put(java.lang.Short.class, "System.Int16");
    JavaToDotnetType.put(java.lang.Integer.class, "System.Int32");
    JavaToDotnetType.put(java.lang.Long.class, "System.Int64");
    JavaToDotnetType.put(java.math.BigInteger.class, "System.UInt64");
    JavaToDotnetType.put(java.lang.Float.class, "System.Single");
    JavaToDotnetType.put(java.lang.Double.class, "System.Double");
    JavaToDotnetType.put(java.math.BigDecimal.class, "System.Decimal");
    JavaToDotnetType.put(void.class, "System.Void");
    JavaToDotnetType.put(java.lang.Boolean[].class, "System.Boolean[]");
    JavaToDotnetType.put(java.lang.String[].class, "System.String[]");
    JavaToDotnetType.put(java.lang.Character[].class, "System.Char[]");
    JavaToDotnetType.put(java.lang.Byte[].class, "System.Byte[]");
    JavaToDotnetType.put(java.lang.Short[].class, "System.Int16[]");
    JavaToDotnetType.put(java.lang.Integer[].class, "System.Int32[]");
    JavaToDotnetType.put(java.lang.Long[].class, "System.Int64[]");
    JavaToDotnetType.put(java.math.BigInteger[].class, "System.UInt64[]");
    JavaToDotnetType.put(java.lang.Float[].class, "System.Single[]");
    JavaToDotnetType.put(java.lang.Double[].class, "System.Double[]");
    JavaToDotnetType.put(java.math.BigDecimal[].class, "System.Decimal[]");
  }

  public static <T> T Convert(Object o, Class<T> type) {
    try {
      if (!(o instanceof NObject) || type.isAssignableFrom(NObject.class)) return (T) o;

      if (type.getName() == "java.lang.Object") return ConvertToConcreteInterfaceImplementation(o);

      return (T) Class.forName(type.getName()).getConstructor(NObject.class).newInstance(o);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public static <T> NType getGetObjectName(T arg1) throws JavonetException {
    return Javonet.getType(Javonet.getType("Common.WrapperHelper").invoke("GetObjectName", arg1));
  }

  public static NType getReturnObjectName(Class<?> type) throws JavonetException {
    // convert simple type to dotnet equivalent
    if (JavaToDotnetType.containsKey(type)) {
      return Javonet.getType(JavaToDotnetType.get(type));
    }

    // wrapper type
    return Javonet.getType(type.getName());
  }

  public static <T> Object ConvertNObjectToDestinationType(Object res, Class<T> returnArrayType) {
    if (!res.getClass().isArray()) {
      return res;
    }

    Object[] array = (Object[]) res;

    Class<?> elementType = array.getClass().getComponentType();
    T[] newArray = (T[]) Array.newInstance(returnArrayType, array.length);

    if (elementType.isArray()) {
      for (int i = 0; i < array.length; i++) {
        newArray[i] = (T) ConvertNObjectToDestinationType(array[i], returnArrayType);
      }
    } else if (elementType.isAssignableFrom(NObject.class)) {
      for (int i = 0; i < array.length; i++) {
        T elem = (T) ConvertToConcreteInterfaceImplementation(array[i]);
        newArray[i] = elem;
      }
    } else {
      for (int i = 0; i < array.length; i++) {
        newArray[i] = (T) array[i];
      }
    }
    return newArray;
  }

  public static <T> T ConvertToConcreteInterfaceImplementation(Object obj) {
    if (obj instanceof NObject) {
      try {
        Class<?> wrapperType;
        NObject nObject = (NObject) obj;
        NObject t = nObject.invoke("GetType");
        String fullName = t.get("FullName");
        if (fullName.equals("System.__ComObject")) {
          NObject type =
              Javonet.getType("Common.WrapperHelper").invoke("IdentifyCOMObjectType", obj);
          fullName = type.<String>get("FullName");
          // failover for Coms without class implementation
          if (type.<Boolean>get("IsInterface") == true) {
            fullName = AdjustNameToJavaType(fullName);
            wrapperType = Class.forName(fullName);
            if (fullName != null) {
              return (T)
                  Proxy.newProxyInstance(
                      AnonymousComObjectInvocationHandler.class.getClassLoader(),
                      new Class[] {wrapperType},
                      new AnonymousComObjectInvocationHandler(obj));
            }
            return null;
          }
        }
        fullName = AdjustNameToJavaType(fullName);
        wrapperType = Class.forName(fullName);
        if (wrapperType == null) return (T) nObject;
        return (T) wrapperType.getConstructor(NObject.class).newInstance(nObject);
      } catch (Exception e) {
        e.printStackTrace();
        return null;
      }
    }
    return (T) obj;
  }

  public static String AdjustNameToJavaType(String fullName) {
    // Support nested classes
    fullName = fullName.replace("+", "$");
    // Remove parametrized generics (java has no generics in runtime)
    if (fullName.contains("[")) fullName = fullName.substring(0, fullName.indexOf("["));
    // Remove unparameterized generics (for parent classes of nested types)
    fullName = fullName.replaceAll("\\s*\\`\\s*[0-9]*", "");
    // Support system namespace prefix
    if (fullName.startsWith("System")) fullName = "jio." + fullName;
    return fullName;
  }
}
