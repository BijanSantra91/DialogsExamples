package com.example.bijan.exdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;
    TextView tv1,tv2;

    public void catchDateData(String date){
        tv1.setText("SELECTED : " +date);
    }

    public void catchTimeData(String time){
        tv2.setText("SELECTED : " +time);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        tv1 = (TextView) findViewById(R.id.textview1);
        tv2 = (TextView) findViewById(R.id.textview2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DialogFrag dialogFrag = new DialogFrag();
                dialogFrag.show(getSupportFragmentManager(), null);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ProgressDialogFrag progressDialogFrag = new ProgressDialogFrag();
                progressDialogFrag.show(getSupportFragmentManager(), null);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePicker datePicker = new DatePicker();
                datePicker.show(getSupportFragmentManager(), null);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TimePicker timePicker = new TimePicker();
                timePicker.show(getSupportFragmentManager(), null);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CustomDialog customDialog = new CustomDialog();
                customDialog.show(getSupportFragmentManager(), null);

            }
        });
    }
}
