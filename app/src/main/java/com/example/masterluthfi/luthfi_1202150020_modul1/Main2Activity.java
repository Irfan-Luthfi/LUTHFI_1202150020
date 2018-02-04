package com.example.masterluthfi.luthfi_1202150020_modul1;

/**
 * Created by Master LUTHFI on 04-Feb-18.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String menuu = intent.getStringExtra("Menu");
        String porsii = intent.getStringExtra("Porsi");
        String eatbuss = intent.getStringExtra("Toko");
        String harga = intent.getStringExtra("Harga");

        int jlh_harga = Integer.valueOf(porsii)*Integer.valueOf(harga);

        TextView menu = (TextView) findViewById(R.id.view_menu);
        TextView porsi = (TextView) findViewById(R.id.view_porsi);
        TextView eatbus = (TextView) findViewById(R.id.text_toko);
        TextView hargaa = (TextView) findViewById(R.id.view_harga);

        menu.setText(menuu);
        porsi.setText(porsii);
        eatbus.setText(eatbuss);
        hargaa.setText(String.valueOf(jlh_harga));

        if (jlh_harga > 65500){
            Toast toast = Toast.makeText(this, R.string.tdk_cukup, Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(this, R.string.cukup, Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
