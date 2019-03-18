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

public class NBPExchangeRate {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTableNumber() {
    try {
      java.lang.String res = javonetHandle.get("TableNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.math.BigDecimal getConversionRate() {
    try {
      java.math.BigDecimal res = javonetHandle.get("ConversionRate");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.math.BigDecimal getExchangeRate() {
    try {
      java.math.BigDecimal res = javonetHandle.get("ExchangeRate");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCurrency() {
    try {
      java.lang.String res = javonetHandle.get("Currency");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public NBPExchangeRate(
      java.lang.String tableNumber,
      java.math.BigDecimal conversionRate,
      java.math.BigDecimal exchangeRate,
      java.lang.String currency) {
    try {
      javonetHandle =
          Javonet.New(
              "NBPExchangeRates.NBPExchangeRate",
              tableNumber,
              conversionRate,
              exchangeRate,
              currency);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NBPExchangeRate(NObject handle) {
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
