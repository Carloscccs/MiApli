package com.example.carlo.miapli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    private Button btnSumar, btnRestar, btnMultiplicar;
    private TextView lbResultado;
    private EditText txtOperacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        lbResultado = findViewById(R.id.lbResultado);
        txtOperacion = findViewById(R.id.txtOperacion);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = Integer.parseInt(txtOperacion.getText().toString());
                numero += 2;
                lbResultado.setText(""+numero);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = Integer.parseInt(txtOperacion.getText().toString());
                lbResultado.setText(""+(numero*2));
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = Integer.parseInt(txtOperacion.getText().toString());
                lbResultado.setText(""+(numero-2));
            }
        });
    }
}
