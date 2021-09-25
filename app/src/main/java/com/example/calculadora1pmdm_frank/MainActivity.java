package com.example.calculadora1pmdm_frank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv = null;
    int opc = 0;
    double op1 = 0.0, op2 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv1);
    }

    public void add9(View v) {
        tv.setText(tv.getText() + "9");
    }

    public void add8(View v) {
        tv.setText(tv.getText() + "8");
    }

    public void add7(View v) {
        tv.setText(tv.getText() + "7");
    }

    public void add6(View v) {
        tv.setText(tv.getText() + "6");
    }

    public void add5(View v) {
        tv.setText(tv.getText() + "5");
    }

    public void add4(View v) {
        tv.setText(tv.getText() + "4");
    }

    public void add3(View v) {
        tv.setText(tv.getText() + "3");
    }

    public void add2(View v) {
        tv.setText(tv.getText() + "2");
    }

    public void add1(View v) {
        tv.setText(tv.getText() + "1");
    }

    public void add0(View v) {
        tv.setText(tv.getText() + "0");
    }

    public void adddec(View v) {
        tv.setText(tv.getText() + ".");
    }

    public void ce(View v) {
        tv.setText("");
        op1 = 0.0;
        op2 = 0.0;
        opc = 0;
    }

    public void suma(View v) {
        op1 = Double.parseDouble("" + tv.getText());
        tv.setText("");
        opc = 1;
    }


    public void resta(View v) {
        op1 = Double.parseDouble("" + tv.getText());
        tv.setText("");
        opc = 2;
    }

    public void multiplicacion(View v) {
        op1 = Double.parseDouble("" + tv.getText());
        tv.setText("");
        opc = 3;
    }

    public void division(View v) {
        op1 = Double.parseDouble("" + tv.getText());
        tv.setText("");
        opc = 4;
    }

    public void ejecutar(View v) {
        double resultado = 0.0;
        op2 = Double.parseDouble("" + tv.getText());
        switch (opc) {
            case 0:
                tv.setText("");
                break;
            case 1:
                resultado = op1 + op2;
                break;
            case 2:
                resultado = op1 - op2;
                break;
            case 3:
                resultado = op1 * op2;
                break;
            case 4:
                resultado = op1 / op2;
                break;
            default:
                tv.setText("");
        }
        tv.setText("" + resultado);
    }
}
