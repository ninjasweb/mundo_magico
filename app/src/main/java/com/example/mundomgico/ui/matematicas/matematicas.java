package com.example.mundomgico.ui.matematicas;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import com.example.mundomgico.R;

public class matematicas extends AppCompatActivity {
        EditText editText1, editText2;
        TextView resultado1,resultado2,resultado3,resultado4;
        Button salir;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_matematicas);

            editText1 =(EditText) findViewById(R.id.num1);
            editText2 =(EditText) findViewById(R.id.num2);
            resultado1 =(TextView) findViewById(R.id.resul);
            resultado2 =(TextView) findViewById(R.id.resul2);
            resultado3 =(TextView) findViewById(R.id.resul3);
            resultado4 =(TextView) findViewById(R.id.resul4);
            salir =(Button) findViewById(R.id.Salir);

            salir.setOnClickListener((v)->{salir();});

        }
        public void Sumar(View v) {
            String n1 = editText1.getText().toString();
            double nm1 = Double.parseDouble(n1);
            String n2 = editText2.getText().toString();
            double nm2 = Double.parseDouble(n2);
            double res = (nm1 + nm2);
            resultado1.setText("Resultado:"+res);
        }
        public void Restar(View v) {
            String n1 = editText1.getText().toString();
            double nm1 = Double.parseDouble(n1);
            String n2 = editText2.getText().toString();
            double nm2 = Double.parseDouble(n2);
            double res = (nm1 - nm2);
            resultado2.setText("Resultado:"+res);
        }

        public void Multiplicar(View v) {
            String n1 = editText1.getText().toString();
            double nm1 = Double.parseDouble(n1);
            String n2 = editText2.getText().toString();
            double nm2 = Double.parseDouble(n2);
            double res = (nm1 * nm2);
            resultado3.setText("Resultado:"+res);
        }

        public void Dividir(View v) {
            String n1 = editText1.getText().toString();
            double nm1 = Double.parseDouble(n1);
            String n2 = editText2.getText().toString();
            double nm2 = Double.parseDouble(n2);
            double res = (nm1 / nm2);
            resultado4.setText("Resultado:"+res);
        }

        private void salir(){
            finish();
        }
    }

