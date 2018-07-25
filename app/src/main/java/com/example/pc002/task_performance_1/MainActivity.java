package com.example.pc002.task_performance_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void what (View view)
        {
            EditText val = (EditText) findViewById(R.id.text);
            String a = val.getText().toString();
            EditText lue = (EditText) findViewById(R.id.blog);
            String b = lue.getText().toString();

            Log.d("MainActivity","Title: "+ a);
            Log.d("MainActivity","Blog: "+ b);

        }
    }


