package com.example.giwangnuelsyaputri.tugasgiwang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Penjumlahan extends AppCompatActivity {
    private Button Back;
    private Button Hasil;
    private EditText etX, etY;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjumlahan);
        Hasil = findViewById(R.id.bhasil);
        tvHasil = findViewById(R.id.tvhasil);
        etX = findViewById(R.id.etX);
        etY = findViewById(R.id.etY);
        Back = findViewById(R.id.back);

        Hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double X = Double.parseDouble(etX.getText().toString());
                    double Y = Double.parseDouble(etY.getText().toString());
                    double hasil = X + Y;
                    tvHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Penjumlahan.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
