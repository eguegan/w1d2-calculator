package com.example.admin.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.am_btn_1) Button mButton0;
    @Bind(R.id.am_btn_2) Button mButton1;
    @Bind(R.id.am_btn_3) Button mButton2;
    @Bind(R.id.am_btn_4) Button mButton3;
    @Bind(R.id.am_btn_5) Button mButton4;
    @Bind(R.id.am_btn_6) Button mButton5;
    @Bind(R.id.am_btn_7) Button mButton6;
    @Bind(R.id.am_btn_8) Button mButton7;
    @Bind(R.id.am_btn_9) Button mButton8;
    @Bind(R.id.am_btn_10) Button mButton9;
    @Bind(R.id.am_btn_11) Button mButton10;
    @Bind(R.id.am_btn_12) Button mButton11;
    @Bind(R.id.am_btn_13) Button mButton12;
    @Bind(R.id.am_btn_14) Button mButton13;
    @Bind(R.id.am_btn_15) Button mButton14;
    @Bind(R.id.am_btn_16) Button mButton15;

    private EditText mEditText;

    private String previewText = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mEditText = (EditText) findViewById(R.id.am_edittext_1);

//        =
        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(doMathOperation());
            }
        });
//        AC
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetInput();
            }
        });
//        0
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton2.getText().toString());
            }
        });
//        .
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton3.getText().toString());
            }
        });
//        +
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton4.getText().toString());
            }
        });
//        1
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton5.getText().toString());
            }
        });
//        2
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton6.getText().toString());
            }
        });
//        3
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton7.getText().toString());
            }
        });
//        -
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton8.getText().toString());
            }
        });
//        4
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton9.getText().toString());
            }
        });
//        5
        mButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton10.getText().toString());
            }
        });
//        6
        mButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton11.getText().toString());
            }
        });
//        /
        mButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton12.getText().toString());
            }
        });
//        7
        mButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton13.getText().toString());
            }
        });
//        8
        mButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previewAddInput(mButton14.getText().toString());
            }
        });
//        9
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
        previewText += newChar;
        mEditText.setText(previewText);
    }

    public void resetInput(){
        previewText = "";
        mEditText.setText(previewText);
    }

    private String doMathOperation(){
        String mathString = mEditText.getText().toString();
        String returnString = "";

        resetInput();

        if(mathString.contains(" - ")){
            String numbers[] = mathString.split(" - ");

            int x;
            int y;

            x = Integer.parseInt(numbers[0]);
            y = Integer.parseInt(numbers[1]);

            int result = x - y;

            returnString = String.valueOf(result);
        }



        return returnString;
    }
}
