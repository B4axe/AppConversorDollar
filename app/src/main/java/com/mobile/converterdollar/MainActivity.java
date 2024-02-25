package com.mobile.converterdollar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText dollar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.valorRS);

        //pegando o valor do inserido
        dollar = (EditText) findViewById(R.id.valorDollar);
    }

    public void converterValor(View view) {
        //cotação referente ao dia 15/02
        double cotacaoDollar = 4.96;

        String stringDollar = dollar.getText().toString();

        if (stringDollar.equals(".")){
            Toast.makeText(this, "Digite um numero", Toast.LENGTH_SHORT).show();
            result.setText("R$");
        } else if (dollar.getText().length()==0) {
            Toast.makeText(this, "Digite um numero", Toast.LENGTH_SHORT).show();
            result.setText("R$");

        }else {
            Double valorDollar = Double.valueOf(stringDollar);
            double resultado = cotacaoDollar * valorDollar;
            result.setText(String.format("R$ %.2f",
                    resultado ));
        }




    }
}