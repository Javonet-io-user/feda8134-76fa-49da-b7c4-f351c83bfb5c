package jio.System;

public enum DateTimeKind {
  Unspecified(0L),
  Utc(1L),
  Local(2L),
  ;
  private long numVal;

  DateTimeKind(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
