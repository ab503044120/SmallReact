package me.dahei.smallreact;

import android.app.Application;
import android.util.Log;


import net.wequick.small.Small;

/**
 * Created by su on 2016/12/15.
 */

public class MainApplication extends Application {


    private static final String TAG = "MainApplication";


    public MainApplication() {
        // This should be the very first of the application lifecycle.
        // It's also ahead of the installing of content providers by what we can avoid
        // the ClassNotFound exception on if the provider is unimplemented in the host.
        Log.i(TAG, "----MainApplication");
        Small.preSetUp(this);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "----onCreate");
        Small.setBaseUri("http://dahei.me/");
    }

}
