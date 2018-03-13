package com.rogerestrad.practica001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText cuadro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    cuadro= (EditText)findViewById(R.id.TxtCadena);
    }
    public void verificar(View v){
        String  invertida ="";
        String palabra=cuadro.getText().toString();
        for (int x=palabra.length()-1;x>=0;x--)
        invertida = invertida + palabra.charAt(x);
        cuadro.setText(invertida.toUpperCase());

    }
    public void sumar (View v){

    }
}
