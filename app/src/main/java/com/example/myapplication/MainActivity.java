package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RadioGroup;
public class MainActivity extends AppCompatActivity {
private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn_test);
        final TextView tv1 = findViewById(R.id.tv1);
         final TextView tv2 = findViewById(R.id.tv2);
        ImageView im1 = findViewById(R.id.imageView);
        final EditText EdT = findViewById(R.id.edit_text);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.v("111111", "submit");
                String num = EdT.getText().toString();
                if (TextUtils.isEmpty(num)) {
                    tv1.setText("username cannot empty!");
                    Log.v("111111", "username is empty");
                }
                else Log.v("111111", "username is " +  num);

                RadioGroup radioGroup = findViewById(R.id.sex1);
                String sex = "";
                if (radioGroup.getCheckedRadioButtonId() == R.id.radioMale) {
                    sex = "男";
                } else {
                    sex = "女";
                }

                Log.v("111111", "sex is " + sex);
            }
        });


        im1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.v("111111", "click the Image");
            tv2.setText("Welcome to tiktok!");
             }
         }
        );



    }
}
