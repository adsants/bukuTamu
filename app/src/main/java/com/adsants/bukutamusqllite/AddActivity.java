package com.adsants.bukutamusqllite;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    RadioGroup radio_kelamin;
    RadioButton input_radio_cewek,input_radio_cowok;
    EditText input_nama,input_alamat;
    Button btn_simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        radio_kelamin       = findViewById(R.id.radio_kelamin);
        input_radio_cowok   = findViewById(R.id.input_radio_cowok);
        input_radio_cewek   = findViewById(R.id.input_radio_cewek);
        input_nama          = findViewById(R.id.input_nama);
        input_alamat        = findViewById(R.id.input_alamat);
        btn_simpan        = findViewById(R.id.btn_simpan);

        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),  "Nama : "+ input_nama.getText().toString() +", Alamatku adalah  : "+ input_alamat.getText().toString() , Toast.LENGTH_LONG).show();
                Snackbar.make(findViewById(R.id.til), "Contoh sebuah Snackbar", Snackbar.LENGTH_LONG).setAction("Action!", this).show();
            }
        });


        getSupportActionBar().setTitle("Tambah Data");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
