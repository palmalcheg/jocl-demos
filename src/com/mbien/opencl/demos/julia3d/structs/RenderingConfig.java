/* !---- DO NOT EDIT: This file autogenerated by com/sun/gluegen/JavaEmitter.java on Tue Feb 09 18:20:26 CET 2010 ----! */


package com.mbien.opencl.demos.julia3d.structs;

import java.nio.*;

import com.sun.gluegen.runtime.*;


public abstract class RenderingConfig {

  StructAccessor accessor;

  public static int size() {
//    if (CPU.is32Bit()) {
//      return RenderingConfig32.size();
//    } else {
      return RenderingConfig64.size();
//    }
  }

  public static RenderingConfig create() {
    return create(BufferFactory.newDirectByteBuffer(size()));
  }

  public static RenderingConfig create(java.nio.ByteBuffer buf) {
//    if (CPU.is32Bit()) {
//      return new RenderingConfig32(buf);
//    } else {
      return new RenderingConfig64(buf);
//    }
  }

  RenderingConfig(java.nio.ByteBuffer buf) {
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  public abstract RenderingConfig setWidth(int val);

  public abstract int getWidth();

  public abstract RenderingConfig setHeight(int val);

  public abstract int getHeight();

  public abstract RenderingConfig setSuperSamplingSize(int val);

  public abstract int getSuperSamplingSize();

  public abstract RenderingConfig setActvateFastRendering(int val);

  public abstract int getActvateFastRendering();

  public abstract RenderingConfig setEnableShadow(int val);

  public abstract int getEnableShadow();

  public abstract RenderingConfig setMaxIterations(int val);

  public abstract int getMaxIterations();

  public abstract RenderingConfig setEpsilon(float val);

  public abstract float getEpsilon();

  public abstract RenderingConfig setMu(float[] val);

  public abstract float[] getMu();

  public abstract RenderingConfig setLight(float[] val);

  public abstract float[] getLight();

  public abstract Camera getCamera();
}