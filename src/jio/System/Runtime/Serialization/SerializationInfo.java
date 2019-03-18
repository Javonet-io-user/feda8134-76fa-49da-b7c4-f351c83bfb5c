package jio.System.Runtime.Serialization;

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
import jio.System.Runtime.Serialization.*;
import jio.System.*;

public class SerializationInfo {
  public NObject javonetHandle;

  public SerializationInfo(jio.System.Type type, IFormatterConverter converter) {
    try {
      javonetHandle =
          Javonet.New("System.Runtime.Serialization.SerializationInfo", type, converter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SerializationInfo(
      jio.System.Type type,
      IFormatterConverter converter,
      java.lang.Boolean requireSameTokenInPartialTrust) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Runtime.Serialization.SerializationInfo",
              type,
              converter,
              requireSameTokenInPartialTrust);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SerializationInfo(NObject handle) {
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
