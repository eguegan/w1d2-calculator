package com.example.admin.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton0;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButton10;
    private Button mButton11;
    private Button mButton12;
    private Button mButton13;
    private Button mButton14;
    private Button mButton15;

    private EditText mEditText;

    private String previewText = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton0 = (Button) findViewById(R.id.am_btn_1);
        mButton1 = (Button) findViewById(R.id.am_btn_2);
        mButton2 = (Button) findViewById(R.id.am_btn_3);
        mButton3 = (Button) findViewById(R.id.am_btn_4);
        mButton4 = (Button) findViewById(R.id.am_btn_5);
        mButton5 = (Button) findViewById(R.id.am_btn_6);
        mButton6 = (Button) findViewById(R.id.am_btn_7);
        mButton7 = (Button) findViewById(R.id.am_btn_8);
        mButton8 = (Button) findViewById(R.id.am_btn_9);
        mButton9 = (Button) findViewById(R.id.am_btn_10);
        mButton10 = (Button) findViewById(R.id.am_btn_11);
        mButton11 = (Button) findViewById(R.id.am_btn_12);
        mButton12 = (Button) findViewById(R.id.am_btn_13);
        mButton13 = (Button) findViewById(R.id.am_btn_14);
        mButton14 = (Button) findViewById(R.id.am_btn_15);
        mButton15 = (Button) findViewById(R.id.am_btn_16);

        mEditText = (EditText) findViewById(R.id.am_edittext_1);

//        mButton[0].setOnClickListener( Log.d("BTNTAG_", mButton[0].getText()) );
        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BTNTAG_", mButton0.getText().toString());
            }
        });
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BTNTAG_", mButton1.getText().toString());
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton2.getText().toString());
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton3.getText().toString());
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton4.getText().toString());
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton5.getText().toString());
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton6.getText().toString());
            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton7.getText().toString());
            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton8.getText().toString());
            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton9.getText().toString());
            }
        });
        mButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton10.getText().toString());
            }
        });
        mButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton11.getText().toString());
            }
        });
        mButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton12.getText().toString());
            }
        });
        mButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton13.getText().toString());
            }
        });
        mButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton14.getText().toString());
            }
        });
        mButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton15.getText().toString());
            }
        });


    }

    public void startSecondAct(View view){
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivityForResult(intent, 1);
    }

    public void previewAddInput(String newChar){
        previewText = newChar + previewText;
        mEditText.setText(previewText);
    }
}
