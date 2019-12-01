/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public final class metric_type_t {
  public final static metric_type_t counter = new metric_type_t("counter");
  public final static metric_type_t gauge = new metric_type_t("gauge");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static metric_type_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + metric_type_t.class + " with value " + swigValue);
  }

  private metric_type_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private metric_type_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private metric_type_t(String swigName, metric_type_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static metric_type_t[] swigValues = { counter, gauge };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

