package com.example.appcalculadoradivisas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton ibtnBorra;
    Button btnReset;
    Button btnComa;
    Button btnIntro;
    Button btnNum0;
    Button btnNum1;
    Button btnNum2;
    Button btnNum3;
    Button btnNum4;
    Button btnNum5;
    Button btnNum6;
    Button btnNum7;
    Button btnNum8;
    Button btnNum9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ibtnBorra = (ImageButton)findViewById((R.id.btnBorra));
        btnComa = (Button)findViewById(R.id.btnComa);
        btnIntro = (Button)findViewById(R.id.btnIntro);
        btnReset = (Button)findViewById(R.id.btnReset);
        btnNum0 = (Button)findViewById(R.id.btnNum0);
        btnNum1 = (Button)findViewById(R.id.btnNum1);
        btnNum2 = (Button)findViewById(R.id.btnNum2);
        btnNum3 = (Button)findViewById(R.id.btnNum3);
        btnNum4 = (Button)findViewById(R.id.btnNum4);
        btnNum5 = (Button)findViewById(R.id.btnNum5);
        btnNum6 = (Button)findViewById(R.id.btnNum6);
        btnNum7 = (Button)findViewById(R.id.btnNum7);
        btnNum8 = (Button)findViewById(R.id.btnNum8);
        btnNum9 = (Button)findViewById(R.id.btnNum9);

    }
    public View.OnClickListener onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            Bundle b = new Bundle();
            switch (v.getId()){
                case R.id.btnNum0:
                    break;
            }
        }
    };
}
