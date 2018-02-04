package com.example.masterluthfi.luthfi_1202150020_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mIsiMenu;
    private EditText mIsiPorsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIsiMenu = (EditText) findViewById(R.id.menu);
        mIsiPorsi = (EditText) findViewById(R.id.porsi);

    }

    public void Eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String isiMenu = mIsiMenu.getText().toString();
        String isiPorsi = mIsiPorsi.getText().toString();

        intent.putExtra("Harga", "50000");
        intent.putExtra("Menu", isiMenu);
        intent.putExtra("Porsi", isiPorsi);
        intent.putExtra("Toko", "Eatbus");

        startActivity(intent);
    }

    public void Abnormal(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String isiMenu = mIsiMenu.getText().toString();
        String isiPorsi = mIsiPorsi.getText().toString();

        intent.putExtra("Harga", "30000");
        intent.putExtra("Menu", isiMenu);
        intent.putExtra("Porsi", isiPorsi);
        intent.putExtra("Toko", "Abnormal");

        startActivity(intent);
    }
}
