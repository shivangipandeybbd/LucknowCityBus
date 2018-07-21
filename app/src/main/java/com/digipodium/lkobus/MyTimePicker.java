package com.digipodium.lkobus;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.app.DialogFragment;
import android.widget.TextClock;
import android.widget.TimePicker;

import java.util.Calendar;

public class MyTimePicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c=Calendar.getInstance();
        int h=c.get(Calendar.HOUR_OF_DAY);
        int m=c.get(Calendar.MINUTE);
        TimePickerDialog tpd=new TimePickerDialog(getActivity(),this,h,m,false);

        return tpd;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextClock tc=getActivity().findViewById(R.id.textClock);
        tc.setText(String.format("%02d:%02d",hourOfDay,minute));
    }
}
