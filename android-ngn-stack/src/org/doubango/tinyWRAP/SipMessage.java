/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class SipMessage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SipMessage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SipMessage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_SipMessage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public byte[] getSipContent() {
    final int clen = (int)this.getSipContentLength();
    if(clen>0){
		final java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocateDirect(clen);
        final int read = (int)this.getSipContent(buffer, clen);
        final byte[] bytes = new byte[read];
        buffer.get(bytes, 0, read);
        return bytes;
    }
    return null;
  }

  public SipMessage() {
    this(tinyWRAPJNI.new_SipMessage(), true);
  }

  public boolean isResponse() {
    return tinyWRAPJNI.SipMessage_isResponse(swigCPtr, this);
  }

  public short getResponseCode() {
    return tinyWRAPJNI.SipMessage_getResponseCode(swigCPtr, this);
  }

  public String getSipHeaderValue(String name, long index) {
    return tinyWRAPJNI.SipMessage_getSipHeaderValue__SWIG_0(swigCPtr, this, name, index);
  }

  public String getSipHeaderValue(String name) {
    return tinyWRAPJNI.SipMessage_getSipHeaderValue__SWIG_1(swigCPtr, this, name);
  }

  public String getSipHeaderParamValue(String name, String param, long index) {
    return tinyWRAPJNI.SipMessage_getSipHeaderParamValue__SWIG_0(swigCPtr, this, name, param, index);
  }

  public String getSipHeaderParamValue(String name, String param) {
    return tinyWRAPJNI.SipMessage_getSipHeaderParamValue__SWIG_1(swigCPtr, this, name, param);
  }

  public long getSipContentLength() {
    return tinyWRAPJNI.SipMessage_getSipContentLength(swigCPtr, this);
  }

  public long getSipContent(java.nio.ByteBuffer output, long maxsize) {
    return tinyWRAPJNI.SipMessage_getSipContent(swigCPtr, this, output, maxsize);
  }

  public SdpMessage getSdpMessage() {
    long cPtr = tinyWRAPJNI.SipMessage_getSdpMessage(swigCPtr, this);
    return (cPtr == 0) ? null : new SdpMessage(cPtr, false);
  }

}
