package com.example.landa.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText edtpanjang,edtlebar;
    private Button btn;
    private TextView txtluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtpanjang = (EditText)findViewById(R.id.panjang);
        edtlebar   = (EditText)findViewById(R.id.lebar);
        btn        =  (Button) findViewById(R.id.btnhitung);
        txtluas  = (TextView)findViewById(R.id.hasil);


        btn.setOnClickListener(new View.OnClickListener() {

         @Override
            public  void  onClick(View view ){

             String panjang = edtpanjang.getText().toString().trim();
             String lebar  = edtlebar.getText().toString().trim();

             double p = Double.parseDouble(panjang);
             double l = Double.parseDouble(lebar);

             double luas = p * l;

             txtluas.setText("Luas : "+luas );
         }


        }
        );


        }
}

