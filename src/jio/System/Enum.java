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

public abstract class Enum extends ValueType implements IComparable, IFormattable, IConvertible {
  protected NObject javonetHandle;

  public Enum(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
