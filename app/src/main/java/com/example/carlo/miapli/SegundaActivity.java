package com.example.carlo.miapli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {


    private TextView textV2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        textV2 = findViewById(R.id.lbVerMensaje);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String word = bundle.getString("Patato");
            textV2.setText(word);
        }else {
            Toast.makeText(this,"No se han recibido parametros",Toast.LENGTH_LONG).show();
        }
    }
}
