package com.example.admin.applicationclass;

/**
 * Created by admin on 7/15/2016.
 */

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends Service {

    private String TAG = "Service Tag";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand attribute value: " + ++ApplicationClass.attribute + "on thread: " + Thread.currentThread().getName());
        return super.onStartCommand(intent, flags, startId);
    }
}
