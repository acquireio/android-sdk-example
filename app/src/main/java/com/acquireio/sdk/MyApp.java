package com.acquireio.sdk;

import android.app.Application;
import android.widget.Toast;

import com.acquireio.AcquireApp;

public class MyApp extends Application {

    public static AcquireApp acquireApp;
    public static String AccId = "YOUR ACCOUNT ID HERE";

    @Override
    public void onCreate() {
        super.onCreate();
        if (AccId.length() < 6) acquireApp = AcquireApp.init(this, AccId);
        else Toast.makeText(this, "Please enter correct Account Id", Toast.LENGTH_SHORT).show();
    }
}
