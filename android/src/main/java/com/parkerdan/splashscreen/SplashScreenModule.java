package com.parkerdan.splashscreen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

class SplashScreenModule extends ReactContextBaseJavaModule {

   public SplashScreenModule(ReactApplicationContext reactContext) {
       super(reactContext);
   }

   @Override
   public String getName() {
       return "SplashScreen";
   }

   /**
    * Show the splash screen.
    */
   @ReactMethod
   public void show() {
       SplashScreen.show(getCurrentActivity());
   }

   /**
    * Close the active splash screen.
    */
   @ReactMethod
   public void close(final String animationType, final int duration, final int delay) {
       SplashScreen.close(animationType, duration, delay, getCurrentActivity() );
   }
}