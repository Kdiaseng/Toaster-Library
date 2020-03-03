package com.example.toasterlibrary;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class ToasterMessage {
    public static void s(Context c, String message){
        Toast.makeText(c, message,Toast.LENGTH_SHORT).show();
    }

    public static void s(Context c, String message, Integer position){
        Toast toast = Toast.makeText(c, message,Toast.LENGTH_SHORT);
        toast.setGravity(position,0,0);
        toast.show();
    }

    public void showCustom(Context c, Activity activity, String message){
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) activity.findViewById(R.id.custom_toast_container));
        TextView tv = layout.findViewById(R.id.txtvw);

        tv.setText(message);
        Toast toast = new Toast(c);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

    }


}
