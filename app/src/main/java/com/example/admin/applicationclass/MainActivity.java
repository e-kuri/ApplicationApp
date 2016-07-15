package com.example.admin.applicationclass;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String BUNDLE_KEY_MESSAGE = "MESSAGE_KEY";
    public static final String CUSTOM_EVENT_KEY = "CUSTOM_EVENT";
    private String TAG = "MainActivity ";
    private BroadcastReceiver mMessageReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String message = intent.getStringExtra(BUNDLE_KEY_MESSAGE);
            Log.d(TAG, "Got message: " + message);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate attribute value = " + ++ApplicationClass.attribute + " on thread: " + Thread.currentThread().getName());
        Intent i = new Intent(this, MyService.class);
        startService(i);
        Intent iService = new Intent(this, MyIntentService.class);
        startService(iService);
        LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver, new IntentFilter(CUSTOM_EVENT_KEY));
    }

    public void broadcastMethod(){
        Intent i = new Intent(this, BroadcastActivity.class);
        startActivity(i);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }


    public void startImage(View view) {
        Intent i = new Intent(this, ImageActivity.class);
        startActivity(i);
    }
}
