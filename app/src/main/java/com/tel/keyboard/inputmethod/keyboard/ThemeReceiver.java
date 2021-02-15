package com.tel.keyboard.inputmethod.keyboard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.widget.Toast;

import com.tel.keyboard.inputmethod.compat.PreferenceManagerCompat;
import com.tel.keyboard.inputmethod.latin.settings.Settings;

public class ThemeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String colorString = intent.getStringExtra("color");
        try{
            int color = Color.parseColor(colorString);
            SharedPreferences mPrefs = PreferenceManagerCompat.getDeviceSharedPreferences(context);
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putInt(Settings.PREF_KEYBOARD_COLOR,color);
            editor.commit();
        }catch(IllegalArgumentException e){
            Toast.makeText(context, "[TEL:Keyboard]: Can not parse color!", Toast.LENGTH_LONG).show();
        }
    }
}
