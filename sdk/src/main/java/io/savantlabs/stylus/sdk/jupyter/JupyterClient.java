package io.savantlabs.stylus.sdk.jupyter;

import java.util.List;

public interface JupyterClient extends AutoCloseable {

  void stop();

  void installPackage(String pkgList) throws InterruptedException;

  void removePackage(String pkgList) throws InterruptedException;

  List<String> listPackage(String pkg) throws InterruptedException;

  boolean hasPackage(String name);

  JupyterKernel startKernel() throws InterruptedException;

  void stopKernel(String kernelId);

  void interruptKernel(String kernelId);

  JupyterKernel getKernel(String kernelId);

  List<JupyterKernel> listKernels();
}
