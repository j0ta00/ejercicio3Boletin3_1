package com.example.juanjomz.ejercicio3boletin3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

Button btnAlignRight,btnAlignLeft;
EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlignLeft=findViewById(R.id.btnAlignLeft);
        btnAlignRight=findViewById(R.id.btnAlignRight);
        ed=findViewById(R.id.ediText);
        btnAlignRight.setOnClickListener(x->alignToTheRight());
        btnAlignLeft.setOnClickListener(x->alignToTheLeft());
    }

    public void alignToTheRight(){
        ed.setGravity(Gravity.RIGHT);

    }
    public void alignToTheLeft(){
        ed.setGravity(Gravity.LEFT);
    }
}