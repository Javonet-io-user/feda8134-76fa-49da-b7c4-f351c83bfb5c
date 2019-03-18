package Common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.javonet.JavonetException;
import com.javonet.api.NObject;

public class AnonymousComObjectInvocationHandler implements InvocationHandler {
  protected NObject javonetHandle;

  public AnonymousComObjectInvocationHandler(Object obj) {
    javonetHandle = (NObject) obj;
  }

  /**
   * Use this method if you concrete type interface is missing any ComObject methods or properties.
   * Using raw Javonet handle you can proceed invoking any method through standard Javonet API.
   *
   * @return handle to Javonet Object.
   */
  public Object GetJavonetHandleObject() {
    return javonetHandle;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    try {

      MethodTypeAnnotation anno = method.getAnnotation(MethodTypeAnnotation.class);
      String methodName = method.getName();
      if (anno.type().equals("GetField")) {
        methodName = methodName.replace("get", "get_");
      } else if (anno.type().equals("SetField")) {
        methodName = methodName.replace("set", "set_");
      }
      Object res = javonetHandle.invoke(methodName, args);
      if (res == null) return null;
      return JavonetHelper.ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
}
