package jio.System;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.*;
import jio.System.Globalization.*;
import jio.System.Runtime.Serialization.*;

public class DateTime extends ValueType
    implements IComparable,
        IFormattable,
        IConvertible,
        ISerializable,
        IComparableT<DateTime>,
        IEquatable<DateTime> {
  protected NObject javonetHandle;

  public DateTime(java.lang.Long ticks) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.DateTime", ticks);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(java.lang.Long ticks, DateTimeKind kind) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.DateTime", ticks, NEnum.fromJavaEnum(kind));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(java.lang.Integer year, java.lang.Integer month, java.lang.Integer day) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.DateTime", year, month, day);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(
      java.lang.Integer year, java.lang.Integer month, java.lang.Integer day, Calendar calendar) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.DateTime", year, month, day, calendar);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.DateTime", year, month, day, hour, minute, second);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second,
      DateTimeKind kind) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.DateTime", year, month, day, hour, minute, second, NEnum.fromJavaEnum(kind));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second,
      Calendar calendar) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.DateTime", year, month, day, hour, minute, second, calendar);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second,
      java.lang.Integer millisecond) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.DateTime", year, month, day, hour, minute, second, millisecond);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second,
      java.lang.Integer millisecond,
      DateTimeKind kind) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.DateTime",
              year,
              month,
              day,
              hour,
              minute,
              second,
              millisecond,
              NEnum.fromJavaEnum(kind));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second,
      java.lang.Integer millisecond,
      Calendar calendar) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.DateTime", year, month, day, hour, minute, second, millisecond, calendar);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second,
      java.lang.Integer millisecond,
      Calendar calendar,
      DateTimeKind kind) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.DateTime",
              year,
              month,
              day,
              hour,
              minute,
              second,
              millisecond,
              calendar,
              NEnum.fromJavaEnum(kind));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTime(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ToBoolean(IFormatProvider provider) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToBoolean", provider);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Character ToChar(IFormatProvider provider) {
    try {
      java.lang.Character res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToChar", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte ToSByte(IFormatProvider provider) {
    try {
      java.lang.Byte res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToSByte", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte ToByte(IFormatProvider provider) {
    try {
      java.lang.Byte res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToByte", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Short ToInt16(IFormatProvider provider) {
    try {
      java.lang.Short res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToInt16", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ToUInt16(IFormatProvider provider) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToUInt16", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ToInt32(IFormatProvider provider) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToInt32", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long ToUInt32(IFormatProvider provider) {
    try {
      java.lang.Long res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToUInt32", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long ToInt64(IFormatProvider provider) {
    try {
      java.lang.Long res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToInt64", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigInteger ToUInt64(IFormatProvider provider) {
    try {
      java.math.BigInteger res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToUInt64", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Float ToSingle(IFormatProvider provider) {
    try {
      java.lang.Float res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToSingle", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Double ToDouble(IFormatProvider provider) {
    try {
      java.lang.Double res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToDouble", provider);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal ToDecimal(IFormatProvider provider) {
    try {
      java.math.BigDecimal res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToDecimal", provider);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime ToDateTime(IFormatProvider provider) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToDateTime", provider);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ToType(jio.System.Type type, IFormatProvider provider) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.IConvertible")
              .invoke("ToType", type, provider);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
