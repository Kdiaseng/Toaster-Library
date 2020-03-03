package com.example.toasterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToastStart = findViewById(R.id.btnToastStart);
        Button btnToastCenterV = findViewById(R.id.btnToastCenterVertical);
        Button btnToastCenter = findViewById(R.id.btnToastCenter);
        Button btnToastCustom = findViewById(R.id.btnToastCustom);



        btnToastStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToasterMessage.s(getApplicationContext(), "Library is Working - Toast START", Gravity.START);
            }
        });


        btnToastCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToasterMessage.s(getApplicationContext(), "Library is Working - Toast DEFAULT");
            }
        });


        btnToastCenterV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToasterMessage.s(getApplicationContext(), "Library is Working - Toast Vertical", Gravity.CENTER_VERTICAL);
            }
        });

        btnToastCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ToasterMessage toasterMessage = new ToasterMessage();
               toasterMessage.showCustom(getApplicationContext(), MainActivity.this,"Library is working - Toast Custom");
            }
        });

        ToasterMessage.s(this, "Library is Working");
    }
}
