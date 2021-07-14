package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "The activity state---->onCreate");

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.bb);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "btn1", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this , PracticeActivity.class);
                startActivity(intent2);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentx = new Intent(MainActivity.this , RecyclerViewActivity.class);
                startActivity(intentx);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"));
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent3);
            }
        });
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "The activity state---->onStart");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "The activity state---->onRestart");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "The activity state---->onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "The activity state---->onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "The activity state---->onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "The activity state---->onDestroy");
    }
}
