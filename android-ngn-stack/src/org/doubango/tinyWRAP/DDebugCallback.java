/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class DDebugCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public DDebugCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(DDebugCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_DDebugCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    tinyWRAPJNI.DDebugCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    tinyWRAPJNI.DDebugCallback_change_ownership(this, swigCPtr, true);
  }

  public DDebugCallback() {
    this(tinyWRAPJNI.new_DDebugCallback(), true);
    tinyWRAPJNI.DDebugCallback_director_connect(this, swigCPtr, swigCMemOwn, false);
  }

  public int OnDebugInfo(String message) {
    return (getClass() == DDebugCallback.class) ? tinyWRAPJNI.DDebugCallback_OnDebugInfo(swigCPtr, this, message) : tinyWRAPJNI.DDebugCallback_OnDebugInfoSwigExplicitDDebugCallback(swigCPtr, this, message);
  }

  public int OnDebugWarn(String message) {
    return (getClass() == DDebugCallback.class) ? tinyWRAPJNI.DDebugCallback_OnDebugWarn(swigCPtr, this, message) : tinyWRAPJNI.DDebugCallback_OnDebugWarnSwigExplicitDDebugCallback(swigCPtr, this, message);
  }

  public int OnDebugError(String message) {
    return (getClass() == DDebugCallback.class) ? tinyWRAPJNI.DDebugCallback_OnDebugError(swigCPtr, this, message) : tinyWRAPJNI.DDebugCallback_OnDebugErrorSwigExplicitDDebugCallback(swigCPtr, this, message);
  }

  public int OnDebugFatal(String message) {
    return (getClass() == DDebugCallback.class) ? tinyWRAPJNI.DDebugCallback_OnDebugFatal(swigCPtr, this, message) : tinyWRAPJNI.DDebugCallback_OnDebugFatalSwigExplicitDDebugCallback(swigCPtr, this, message);
  }

}
