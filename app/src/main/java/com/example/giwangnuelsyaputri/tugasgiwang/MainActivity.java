package com.example.giwangnuelsyaputri.tugasgiwang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bT, bKu, bKa, bB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bT = findViewById(R.id.b1);
        bKu = findViewById(R.id.b2);
        bKa = findViewById(R.id.b3);
        bB = findViewById(R.id.b4);

        bT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Penjumlahan.class);
                startActivity(intent);
            }
        });
        bKu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pengurangan.class);
                startActivity(intent);
            }
        });
        bKa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Perkalian.class);
                startActivity(intent);
            }
        });
        bB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pembagian.class);
                startActivity(intent);
            }
        });

    }
}

