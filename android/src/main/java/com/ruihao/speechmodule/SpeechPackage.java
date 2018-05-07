package com.ruihao.speechmodule;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class SpeechPackage implements ReactPackage {
  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    // return Arrays.<NativeModule>asList(
    //   new ScreenshotModule(reactContext)
    // );
    List<NativeModule> modules = new ArrayList<>();
    modules.add(new com.ruihao.speechmodule.SpeechModule(reactContext));
    return modules;
  }


  public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
