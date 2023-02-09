package com.example.kalkulator1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Kalkulator extends AppCompatActivity {

    EditText angka1, angka2;
    Button btnPlus, btnMinus, btnKali, btnBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angka1 = (EditText) findViewById(R.id.txtfirstnumber);
        angka2 = (EditText) findViewById(R.id.txtsecondnumber);
        btnPlus = (Button) findViewById(R.id.btnplus);
        btnMinus = (Button) findViewById(R.id.btnminus);
        btnKali = (Button) findViewById(R.id.btntimes);
        btnBagi = (Button) findViewById(R.id.btndivide);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angkaPertama = Integer.parseInt(angka1.getText().toString());
                int angkaKedua = Integer.parseInt(angka2.getText().toString());
                int hasil = angkaPertama + angkaKedua;

                Toast.makeText(getApplicationContext(), "hasil: " + hasil, Toast.LENGTH_SHORT).show();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angkaPertama = Integer.parseInt(angka1.getText().toString());
                int angkaKedua = Integer.parseInt(angka2.getText().toString());
                int hasil = angkaPertama - angkaKedua;

                Toast.makeText(getApplicationContext(), "hasil: " + hasil, Toast.LENGTH_SHORT).show();
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angkaPertama = Integer.parseInt(angka1.getText().toString());
                int angkaKedua = Integer.parseInt(angka2.getText().toString());
                int hasil = angkaPertama * angkaKedua;

                Toast.makeText(getApplicationContext(), "hasil: " + hasil, Toast.LENGTH_SHORT).show();
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angkaPertama = Integer.parseInt(angka1.getText().toString());
                int angkaKedua = Integer.parseInt(angka2.getText().toString());
                int hasil = angkaPertama / angkaKedua;

                Toast.makeText(getApplicationContext(),"hasil: " + hasil, Toast.LENGTH_SHORT).show();
            }
        });
    }
}