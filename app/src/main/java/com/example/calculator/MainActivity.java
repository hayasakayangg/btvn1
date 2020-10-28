package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String bieuthuc ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button so0 = findViewById(R.id.so0);
        Button so1 = findViewById(R.id.so1);
        Button so2 = findViewById(R.id.so2);
        Button so3 = findViewById(R.id.so3);
        Button so4 = findViewById(R.id.so4);
        Button so5 = findViewById(R.id.so5);
        Button so6 = findViewById(R.id.so6);
        Button so7 = findViewById(R.id.so7);
        Button so8 = findViewById(R.id.so8);
        Button so9 = findViewById(R.id.so9);
        Button cong = findViewById(R.id.cong);
        Button tru = findViewById(R.id.tru);
        Button nhan = findViewById(R.id.nhan);
        Button chia = findViewById(R.id.chia);
        Button clear = findViewById(R.id.clear);
        Button delete = findViewById(R.id.delete);
        Button bang = findViewById(R.id.bang);
        final EditText text = findViewById(R.id.text);

        so0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               bieuthuc += "0";
               text.setText(bieuthuc);
            }
        });
        so1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += "1";
                text.setText(bieuthuc);
            }
        });
        so2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += "2";
                text.setText(bieuthuc);
            }
        });
        so3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += "3";
                text.setText(bieuthuc);
            }
        });
        so4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += "4";
                text.setText(bieuthuc);
            }
        });
        so5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += "5";
                text.setText(bieuthuc);
            }
        });
        so6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += "6";
                text.setText(bieuthuc);
            }
        });
        so7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += "7";
                text.setText(bieuthuc);
            }
        });
        so8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += "8";
                text.setText(bieuthuc);
            }
        });
        so9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += "9";
                text.setText(bieuthuc);
            }
        });
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += " + ";
                text.setText(bieuthuc);
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += " - ";
                text.setText(bieuthuc);
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += " X ";
                text.setText(bieuthuc);
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc += " ÷ ";
                text.setText(bieuthuc);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bieuthuc = "";
                text.setText(bieuthuc);
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    bieuthuc = bieuthuc.substring(0, bieuthuc.length() - 1);
                    text.setText(bieuthuc);
                }
                catch (Exception e) {
                    bieuthuc = "";
                    text.setText(bieuthuc);
                }
            }
        });
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    char m = '1';
                    int kq = 0;
                    for (int i = 0; i < bieuthuc.length(); i++)
                        if ((bieuthuc.charAt(i) > '9' || bieuthuc.charAt(i) < '0') && bieuthuc.charAt(i) != ' ')
                            m = bieuthuc.charAt(i);
                    String[] a = bieuthuc.split("\\D++");
                    switch (m) {
                        case '+':
                            kq = Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
                            break;
                        case '-':
                            kq = Integer.parseInt(a[0]) - Integer.parseInt(a[1]);
                            break;
                        case 'X':
                            kq = Integer.parseInt(a[0]) * Integer.parseInt(a[1]);
                            break;
                        case '÷':
                            kq = Integer.parseInt(a[0]) / Integer.parseInt(a[1]);
                            break;
                    }
                    text.setText(String.valueOf(kq));
                }
                catch (Exception e) {
                    text.setText("");
                }
            }
        });
    }
}