package com.praktekpertama.myapplication3kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv2 = findViewById(R.id.textView2);
        final EditText et1 = findViewById(R.id.editTextNumber);
        final EditText et2 = findViewById(R.id.editTextNumber2);
        final Button bt1 = findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Tambah="";
                if (view.getId()== bt1.getId()){
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 + x2;
                    Tambah = String.valueOf(hasil);
                    tv2.setText(Tambah);
                }
            }
        });

        final Button bt2 = findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kurang="";
                if (view.getId()== bt2.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 - x2;
                    kurang = String.valueOf(hasil);
                    tv2.setText(kurang);
                }
            }
        });

        final Button bt3 = findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Kali="";
                if (view.getId()== bt3.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 * x2;
                    Kali = String.valueOf(hasil);
                    tv2.setText(Kali);
                }
            }
        });

        final Button bt4 = findViewById(R.id.button4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Bagi="";
                if (view.getId()== bt4.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 / x2;
                    Bagi = String.valueOf(hasil);
                    tv2.setText(Bagi);
                }
            }
        });

    }
}