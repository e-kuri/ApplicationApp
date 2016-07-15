package com.example.admin.applicationclass;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by admin on 7/15/2016.
 */
public class MyIntentService extends IntentService {
    private static final String TAG = "MyIntentService";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent attribute value: " + ++ApplicationClass.attribute + " on thread: " + Thread.currentThread().getName());
    }
}
