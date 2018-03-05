package com.ediertamayo.calculadoraresistencias;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado,tvNegro2,tvNegro3,tvLinea1,tvLinea2,tvMultiplicador,tvTolerancia;
    TextView tvCafe1,tvCafe2,tvCafe3,tvCafe4,tvRojo1,tvRojo2,tvRojo3,tvRojo4,tvNaranja1,tvNaranja2,tvNaranja3;
    TextView tvAmarillo1,tvAmarillo2,tvAmarillo3,tvVerde1,tvVerde2,tvVerde3,tvVerde4,tvAzul1,tvAzul2,tvAzul3,tvAzul4;
    TextView tvMorado1,tvMorado2,tvMorado3,tvMorado4,tvGris1,tvGris2,tvGris3,tvGris4,tvBlanco1,tvBlanco2,tvBlanco3;
    TextView tvDorado3,tvDorado4,tvPlateado3,tvPlateado4;
    String val1="",val2="",val4="",res="";
    Double val3=0.0,resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvLinea1=findViewById(R.id.tvLinea1);
        tvLinea2=findViewById(R.id.tvLinea2);
        tvMultiplicador=findViewById(R.id.tvMultiplicador);
        tvTolerancia=findViewById(R.id.tvTolerancia);

        tvResultado=findViewById(R.id.tvResultado);

        tvNegro2=findViewById(R.id.tvNegro2);
        tvNegro3=findViewById(R.id.tvNegro3);

        tvCafe1=findViewById(R.id.tvCafe1);
        tvCafe2=findViewById(R.id.tvCafe2);
        tvCafe3=findViewById(R.id.tvCafe3);
        tvCafe4=findViewById(R.id.tvCafe4);

        tvRojo1=findViewById(R.id.tvRojo1);
        tvRojo2=findViewById(R.id.tvRojo2);
        tvRojo3=findViewById(R.id.tvRojo3);
        tvRojo4=findViewById(R.id.tvRojo4);

        tvNaranja1=findViewById(R.id.tvNaranja1);
        tvNaranja2=findViewById(R.id.tvNaranja2);
        tvNaranja3=findViewById(R.id.tvNaranja3);

        tvAmarillo1=findViewById(R.id.tvAmarillo1);
        tvAmarillo2=findViewById(R.id.tvAmarillo2);
        tvAmarillo3=findViewById(R.id.tvAmarillo3);

        tvVerde1=findViewById(R.id.tvVerde1);
        tvVerde2=findViewById(R.id.tvVerde2);
        tvVerde3=findViewById(R.id.tvVerde3);
        tvVerde4=findViewById(R.id.tvVerde4);

        tvAzul1=findViewById(R.id.tvAzul1);
        tvAzul2=findViewById(R.id.tvAzul2);
        tvAzul3=findViewById(R.id.tvAzul3);
        tvAzul4=findViewById(R.id.tvAzul4);

        tvMorado1=findViewById(R.id.tvMorado1);
        tvMorado2=findViewById(R.id.tvMorado2);
        tvMorado3=findViewById(R.id.tvMorado3);
        tvMorado4=findViewById(R.id.tvMorado4);

        tvGris1=findViewById(R.id.tvGris1);
        tvGris2=findViewById(R.id.tvGris2);
        tvGris3=findViewById(R.id.tvGris3);
        tvGris4=findViewById(R.id.tvGris4);

        tvBlanco1=findViewById(R.id.tvBlanco1);
        tvBlanco2=findViewById(R.id.tvBlanco2);
        tvBlanco3=findViewById(R.id.tvBlanco3);

        tvDorado3=findViewById(R.id.tvDorado3);
        tvDorado4=findViewById(R.id.tvDorado4);

        tvPlateado3=findViewById(R.id.tvPlateado3);
        tvPlateado4=findViewById(R.id.tvPlateado4);
    }

    public void columna2(View view) {
        int id=view.getId();
        switch (id){
            case R.id.tvNegro2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.black));
                val2="0";
                break;
            case R.id.tvCafe2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.maroon));
                val2="1";
                break;
            case R.id.tvRojo2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.red));
                val2="2";
                break;
            case R.id.tvNaranja2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.orange));
                val2="3";
                break;
            case R.id.tvAmarillo2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.yellow));
                val2="4";
                break;
            case R.id.tvVerde2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.green));
                val2="5";
                break;
            case R.id.tvAzul2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.blue));
                val2="6";
                break;
            case R.id.tvMorado2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.darkgreen));
                val2="7";
                break;
            case R.id.tvGris2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.gray));
                val2="8";
                break;
            case R.id.tvBlanco2:
                tvLinea2.setBackgroundColor(getResources().getColor(R.color.ivory));
                val2="9";
                break;
        }
        res=val1+val2;
        resultado=Double.parseDouble(res);
        tvResultado.setText(Double.toString(resultado)+"Ω"+val4.toString());
    }

    public void columna3(View view) {
        int id=view.getId();
        switch (id){
            case R.id.tvNegro3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.black));
                val3=1.0;
                break;
            case R.id.tvCafe3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.maroon));
                val3=10.0;
                break;
            case R.id.tvRojo3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.red));
                val3=100.0;
                break;
            case R.id.tvNaranja3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.orange));
                val3=1000.0;
                break;
            case R.id.tvAmarillo3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.yellow));
                val3=10000.0;
                break;
            case R.id.tvVerde3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.green));
                val3=100000.0;
                break;
            case R.id.tvAzul3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.blue));
                val3=1000000.0;
                break;
            case R.id.tvMorado3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.darkgreen));
                val3=10000000.0;
                break;
            case R.id.tvGris3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.gray));
                val3=100000000.0;
                break;
            case R.id.tvBlanco3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.ivory));
                val3=1000000000.0;
                break;
            case R.id.tvDorado3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.darkgoldenrod));
                val3=0.1;
                break;
            case R.id.tvPlateado3:
                tvMultiplicador.setBackgroundColor(getResources().getColor(R.color.silver));
                val3=0.01;
                break;
        }
        if(!val1.equals("")&&!val2.equals("")){
            res=val1+val2;
            resultado=Double.parseDouble(res)*val3;
            tvResultado.setText(Double.toString(resultado)+"Ω"+val4.toString());
        }
    }

    public void columna1(View view) {
        int id=view.getId();
        switch (id){
            case R.id.tvCafe1:
                tvLinea1.setBackgroundColor(getResources().getColor(R.color.maroon));
                val1="1";
                break;
            case R.id.tvRojo1:
                tvLinea1.setBackgroundColor(getResources().getColor(R.color.red));
                val1="2";
                break;
            case R.id.tvNaranja1:
                tvLinea1.setBackgroundColor(getResources().getColor(R.color.orange));
                val1="3";
                break;
            case R.id.tvAmarillo1:
                tvLinea1.setBackgroundColor(getResources().getColor(R.color.yellow));
                val1="4";
                break;
            case R.id.tvVerde1:
                tvLinea1.setBackgroundColor(getResources().getColor(R.color.green));
                val1="5";
                break;
            case R.id.tvAzul1:
                tvLinea1.setBackgroundColor(getResources().getColor(R.color.blue));
                val1="6";
                break;
            case R.id.tvMorado1:
                tvLinea1.setBackgroundColor(getResources().getColor(R.color.darkgreen));
                val1="7";
                break;
            case R.id.tvGris1:
                tvLinea1.setBackgroundColor(getResources().getColor(R.color.gray));
                val1="8";
                break;
            case R.id.tvBlanco1:
                tvLinea1.setBackgroundColor(getResources().getColor(R.color.ivory));
                val1="9";
                break;
        }
        res=val1+val2;
        resultado=Double.parseDouble(res);
        tvResultado.setText(Double.toString(resultado)+"Ω"+val4.toString());
    }

    public void columna4(View view) {
        int id=view.getId();
        switch (id){
            case R.id.tvCafe4:
                tvTolerancia.setBackgroundColor(getResources().getColor(R.color.maroon));
                val4="±1%";
                break;
            case R.id.tvRojo4:
                tvTolerancia.setBackgroundColor(getResources().getColor(R.color.red));
                val4="±2%";
                break;
            case R.id.tvVerde4:
                tvTolerancia.setBackgroundColor(getResources().getColor(R.color.green));
                val4="±0.5%";
                break;
            case R.id.tvAzul4:
                tvTolerancia.setBackgroundColor(getResources().getColor(R.color.blue));
                val4="±0.25%";
                break;
            case R.id.tvMorado4:
                tvTolerancia.setBackgroundColor(getResources().getColor(R.color.darkgreen));
                val4="±0.1%";
                break;
            case R.id.tvGris4:
                tvTolerancia.setBackgroundColor(getResources().getColor(R.color.gray));
                val4="±0.05%";
                break;
            case R.id.tvDorado4:
                tvTolerancia.setBackgroundColor(getResources().getColor(R.color.darkgoldenrod));
                val4="±5%";
                break;
            case R.id.tvPlateado4:
                tvTolerancia.setBackgroundColor(getResources().getColor(R.color.silver));
                val4="±10%";
                break;
        }
        if(!val1.equals("")&&!val2.equals("")&&val3!=0.0){
            res=val1+val2;
            resultado=Double.parseDouble(res)*val3;
            tvResultado.setText(Double.toString(resultado)+"Ω"+val4.toString());
        }
    }
}
