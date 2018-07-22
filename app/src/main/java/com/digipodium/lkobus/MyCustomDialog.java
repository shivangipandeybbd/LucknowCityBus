package com.digipodium.lkobus;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MyCustomDialog extends DialogFragment implements DialogInterface.OnClickListener {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("Rate this APP");
        builder.setIcon(R.drawable.ic_favorite_black_24dp);
        LayoutInflater li=(LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;//inflation
        View v=li.inflate(R.layout.custom_layout_dialog,null);
        builder.setView(v);
        builder.setPositiveButton("OKK",this);
        builder.setNegativeButton("NO,tHANKS",this);
        builder.setNeutralButton("REmind me Later",this);
        AlertDialog ad=builder.create();
        return ad;


    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if(which==-1)
        {
            getActivity().finish();
            Toast.makeText(getActivity(),"Exited",Toast.LENGTH_SHORT).show();
        }
        if(which==-2)
        {
            dialog.dismiss();
            Toast.makeText(getActivity(),"Enjoy",Toast.LENGTH_SHORT).show();
        }
        if(which==-3)
        {
            dialog.cancel();
            Toast.makeText(getActivity(),"later",Toast.LENGTH_SHORT).show();
        }
    }
}
