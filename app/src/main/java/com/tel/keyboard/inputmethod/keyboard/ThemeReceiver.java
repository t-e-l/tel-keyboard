package com.tel.keyboard.inputmethod.keyboard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ThemeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Theme Receiver activated!", Toast.LENGTH_LONG).show();
    }
}
