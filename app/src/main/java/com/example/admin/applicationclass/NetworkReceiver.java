package com.example.admin.applicationclass;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NetworkReceiver extends BroadcastReceiver {
    private static final String TAG = "Broadcast Receiver";

    public NetworkReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d(TAG, "onReceive attribute value: " + ++ApplicationClass.attribute);
        Intent i = new Intent(context, MyIntentService.class);
        context.startService(i);
        Toast.makeText(context, "Connection changed", Toast.LENGTH_SHORT).show();
    }
}
