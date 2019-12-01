/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class string_int_pair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected string_int_pair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(string_int_pair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_string_int_pair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public string_int_pair() {
    this(libtorrent_jni.new_string_int_pair__SWIG_0(), true);
  }

  public string_int_pair(String first, int second) {
    this(libtorrent_jni.new_string_int_pair__SWIG_1(first, second), true);
  }

  public string_int_pair(string_int_pair other) {
    this(libtorrent_jni.new_string_int_pair__SWIG_2(string_int_pair.getCPtr(other), other), true);
  }

  public void setFirst(String value) {
    libtorrent_jni.string_int_pair_first_set(swigCPtr, this, value);
  }

  public String getFirst() {
    return libtorrent_jni.string_int_pair_first_get(swigCPtr, this);
  }

  public void setSecond(int value) {
    libtorrent_jni.string_int_pair_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return libtorrent_jni.string_int_pair_second_get(swigCPtr, this);
  }

}
