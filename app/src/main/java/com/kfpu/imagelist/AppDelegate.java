package com.kfpu.imagelist;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by hlopu on 19.11.2017.
 */

public class AppDelegate extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/roboto.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
