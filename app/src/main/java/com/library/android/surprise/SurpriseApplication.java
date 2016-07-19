package com.library.android.surprise;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by sakshiagarwal on 18/07/16.
 */
public class SurpriseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
