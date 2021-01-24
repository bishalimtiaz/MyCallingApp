package com.example.mycallingapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

import java.util.Objects;

public class CallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Objects.requireNonNull(intent.getStringExtra(TelephonyManager.EXTRA_STATE)).equals(TelephonyManager.EXTRA_STATE_OFFHOOK)){
            Toast.makeText(context, "call started", Toast.LENGTH_SHORT).show();
        }

        else if (Objects.requireNonNull(intent.getStringExtra(TelephonyManager.EXTRA_STATE)).equals(TelephonyManager.EXTRA_STATE_IDLE)){
            Toast.makeText(context, "call ended", Toast.LENGTH_SHORT).show();
        }

        else if (Objects.requireNonNull(intent.getStringExtra(TelephonyManager.EXTRA_STATE)).equals(TelephonyManager.EXTRA_STATE_RINGING)){
            Toast.makeText(context, "call ringing", Toast.LENGTH_SHORT).show();
        }
        else if (Objects.requireNonNull(intent.getStringExtra(TelephonyManager.EXTRA_STATE)).equals(TelephonyManager.EXTRA_STATE)){
            Toast.makeText(context, "default state", Toast.LENGTH_SHORT).show();
        }
    }
}
