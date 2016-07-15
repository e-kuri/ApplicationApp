package com.example.admin.applicationclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by admin on 7/15/2016.
 */
public class BroadcastActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivityTAG_";

    private static final String MESSAGE_BROADCASTED = "What are you saying friend?";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }

    public void broadcastMethod(View view){
        Log.d(TAG, "broadcastMessage: " + MESSAGE_BROADCASTED);
        Intent intent = new Intent(MainActivity.CUSTOM_EVENT_KEY);
        intent.putExtra(MainActivity.BUNDLE_KEY_MESSAGE, MESSAGE_BROADCASTED);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
}
