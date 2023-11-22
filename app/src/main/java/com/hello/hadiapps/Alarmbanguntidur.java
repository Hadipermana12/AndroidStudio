package com.hello.hadiapps;

import android.content.Intent;

import android.provider.AlarmClock;

public class Alarmbanguntidur {
    public void createAlarm(String message, int hour, int minutes){
        Intent intent = new intent (AlarmClock. ACTION_SET_ALARM)
                .putExtra(AlarmClock. EXTRA_MESSAGE, message)
                .putExtra(AlarmClock. EXTRA_HOUR, hour)
                .putExtra(AlarmClock. EXTRA_MINUTES, minutes);
        if (intent. resolveActivity(getPackageManager()) != null){
            StartActivity(intent);
        }
    }
}
