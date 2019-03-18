package jio.System.Runtime.Serialization;

public enum StreamingContextStates {
  CrossProcess(1L),
  CrossMachine(2L),
  File(4L),
  Persistence(8L),
  Remoting(16L),
  Other(32L),
  Clone(64L),
  CrossAppDomain(128L),
  All(255L),
  ;
  private long numVal;

  StreamingContextStates(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
