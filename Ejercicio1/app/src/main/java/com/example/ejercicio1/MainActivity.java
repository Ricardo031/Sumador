package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtval1, edtval2;
    TextView txtresultado;
    Button btncalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtval1 = findViewById(R.id.edtval1);
        edtval2 = findViewById(R.id.edtval2);
        txtresultado = findViewById(R.id.txtresultado);
        btncalcular =findViewById(R.id.btncalcular);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String caja1=edtval1.getText().toString();
                String caja2=edtval2.getText().toString();

                if (!caja1.equals("") && !caja2.equals("")) {
                    int v1=Integer.parseInt(caja1);
                    int v2=Integer.parseInt(caja2);

                    int suma = v1 + v2;
                    txtresultado.setText(suma+"");
                }else {
                    Toast.makeText(MainActivity.this, "Coloque un valor en los cuadros", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}