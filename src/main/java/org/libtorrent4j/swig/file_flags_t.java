/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class file_flags_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected file_flags_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(file_flags_t obj) {
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
        libtorrent_jni.delete_file_flags_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static file_flags_t all() {
    return new file_flags_t(libtorrent_jni.file_flags_t_all(), true);
  }

  public boolean nonZero() {
    return libtorrent_jni.file_flags_t_nonZero(swigCPtr, this);
  }

  public boolean eq(file_flags_t f) {
    return libtorrent_jni.file_flags_t_eq(swigCPtr, this, file_flags_t.getCPtr(f), f);
  }

  public boolean ne(file_flags_t f) {
    return libtorrent_jni.file_flags_t_ne(swigCPtr, this, file_flags_t.getCPtr(f), f);
  }

  public file_flags_t or_(file_flags_t other) {
    return new file_flags_t(libtorrent_jni.file_flags_t_or_(swigCPtr, this, file_flags_t.getCPtr(other), other), true);
  }

  public file_flags_t and_(file_flags_t other) {
    return new file_flags_t(libtorrent_jni.file_flags_t_and_(swigCPtr, this, file_flags_t.getCPtr(other), other), true);
  }

  public file_flags_t xor(file_flags_t other) {
    return new file_flags_t(libtorrent_jni.file_flags_t_xor(swigCPtr, this, file_flags_t.getCPtr(other), other), true);
  }

  public file_flags_t inv() {
    return new file_flags_t(libtorrent_jni.file_flags_t_inv(swigCPtr, this), true);
  }

  public int to_int() {
    return libtorrent_jni.file_flags_t_to_int(swigCPtr, this);
  }

  public file_flags_t() {
    this(libtorrent_jni.new_file_flags_t(), true);
  }

}
