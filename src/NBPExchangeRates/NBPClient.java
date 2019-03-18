package NBPExchangeRates;

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
import NBPExchangeRates.*;
import jio.System.*;

public class NBPClient {
  protected NObject javonetHandle;

  public NBPClient() {
    try {
      javonetHandle = Javonet.New("NBPExchangeRates.NBPClient");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NBPClient(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetExactTableLink(DateTime date) {
    try {
      java.lang.String res = Javonet.getType("NBPClient").invoke("GetExactTableLink", date);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetLatestTableLink(DateTime date) {
    try {
      java.lang.String res = Javonet.getType("NBPClient").invoke("GetLatestTableLink", date);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NBPExchangeRate GetLatestExchangeRate(
      DateTime date, java.lang.String currencySymbol) {
    try {
      Object res =
          Javonet.getType("NBPClient").invoke("GetLatestExchangeRate", date, currencySymbol);
      if (res == null) return null;
      return new NBPExchangeRate((NObject) res);
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
