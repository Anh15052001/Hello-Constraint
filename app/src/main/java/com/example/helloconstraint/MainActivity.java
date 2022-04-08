package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;
    TextView textView;
    private int mCount = 0;
    Button count;
    Button zero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView3);
        count = (Button) findViewById(R.id.button7);
        zero = (Button) findViewById(R.id.button6);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount++;
                if(textView != null)
                {
                    textView.setText(Integer.toString(mCount));
                }
                if(mCount%2==0)
                {
                    count.setBackgroundColor(count.getContext().getResources().getColor(android.R.color.holo_green_light));

                }
                if(mCount%2==1)
                {
                    count.setBackgroundColor(count.getContext().getResources().getColor(R.color.purple_500));
                }
                zero.setBackgroundColor(zero.getContext().getResources().getColor(R.color.pink));
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount = 0;
                textView.setText(Integer.toString(0));

            }
        });

    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        toast.show();
    }




}