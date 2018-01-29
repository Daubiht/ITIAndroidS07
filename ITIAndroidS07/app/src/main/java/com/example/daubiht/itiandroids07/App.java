package com.example.daubiht.itiandroids07;

import android.app.Application;
import android.content.Context;

/**
 * Created by Daubiht on 29/01/2018.
 */

public class App extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        App.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return App.context;
    }
}
