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

public class Guid extends ValueType
    implements IFormattable, IComparable, IComparableT<Guid>, IEquatable<Guid> {
  protected NObject javonetHandle;

  public Guid(java.lang.Byte[] b) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Guid", new Object[] {b});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Guid(
      java.lang.Long a,
      java.lang.Integer b,
      java.lang.Integer c,
      java.lang.Byte d,
      java.lang.Byte e,
      java.lang.Byte f,
      java.lang.Byte g,
      java.lang.Byte h,
      java.lang.Byte i,
      java.lang.Byte j,
      java.lang.Byte k) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Guid", a, b, c, d, e, f, g, h, i, j, k);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Guid(java.lang.Integer a, java.lang.Short b, java.lang.Short c, java.lang.Byte[] d) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Guid", a, b, c, new Object[] {d});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Guid(
      java.lang.Integer a,
      java.lang.Short b,
      java.lang.Short c,
      java.lang.Byte d,
      java.lang.Byte e,
      java.lang.Byte f,
      java.lang.Byte g,
      java.lang.Byte h,
      java.lang.Byte i,
      java.lang.Byte j,
      java.lang.Byte k) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Guid", a, b, c, d, e, f, g, h, i, j, k);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Guid(java.lang.String g) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Guid", g);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Guid(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
