package com.example.jugabilidad_escojer_palabra;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Jugabilidad3_Activity extends AppCompatActivity {


    TextView lblPregunta;
    EditText txtRespuesta;
    Button btnRes1, btnRes2, btnRes3, btnRes4, btnRes5, btnRes6;
    String Respuesta ="", res, rest;
    String n1 = "1", n2 = "2", n3 = "3", n4 = "4", n5 = "5", n6 = "6";
    String res2 = n3+" ";

    MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugabilidad3);


        inicializar();



    }

    private void inicializar() {
        lblPregunta = (TextView) findViewById(R.id.lblpregunta);
        txtRespuesta = (EditText) findViewById(R.id.txtRespuesta);
        btnRes1 = (Button) findViewById(R.id.btnRes1);
        btnRes1.setText(n1);
        btnRes2 = (Button) findViewById(R.id.btnRes2);
        btnRes2.setText(n2);
        btnRes3 = (Button) findViewById(R.id.btnRes3);
        btnRes3.setText(n3);
        btnRes4 = (Button) findViewById(R.id.btnRes4);
        btnRes4.setText(n4);
        btnRes5 = (Button) findViewById(R.id.btnRes5);
        btnRes5.setText(n5);
        btnRes6 = (Button) findViewById(R.id.btnRes6);
        btnRes6.setText(n6);
    }

    public void Comprobar(View view) {
        rest = txtRespuesta.getText().toString();

        if (rest.isEmpty()) {
            Alert alert = new Alert("Campos vacios");
            alert.show(getSupportFragmentManager(), "Rellenar");
        } else {
            if (rest.equals(res2)) {
                Toast.makeText( this, "correcto: "+res, Toast.LENGTH_SHORT).show();
                Alerta2 alert = new Alerta2("Respuesta correcta");
                alert.show(getSupportFragmentManager(), "Felicidades");

            } else {
                Toast.makeText(this, "respuesta correcta: " + res2 + ". Respuesta ingresada: " + rest, Toast.LENGTH_SHORT).show();

                Alerta2 alert = new Alerta2("Respuesta incorrecta");
                alert.show(getSupportFragmentManager(), "Incorrecto");
            }
        }
        mp = MediaPlayer.create(this,R.raw.confirm);
        mp.start();

    }




    public void btn1(View view) {
        res = btnRes1.getText().toString();
        if (Respuesta == ""){
            Respuesta = n1+" ";
            txtRespuesta.setText(Respuesta);
        }else {
            Respuesta = Respuesta + n1 + " ";
            txtRespuesta.setText(Respuesta);
        }

        mp = MediaPlayer.create(this,R.raw.dsms);
       mp.start();
    }
    public void btn2(View view) {
        res = btnRes2.getText().toString();
        if (Respuesta == ""){
            Respuesta = n2+" ";
            txtRespuesta.setText(Respuesta);
        }else {
            Respuesta = Respuesta + n2 + " ";
            txtRespuesta.setText(Respuesta);
        }

            mp = MediaPlayer.create(this,R.raw.gallatin);
            mp.start();

    }
    public void btn3(View view) {
        res = btnRes3.getText().toString();
        if (Respuesta == ""){
            Respuesta = n3+" ";
            txtRespuesta.setText(Respuesta);
        }else {
            Respuesta = Respuesta + n3 + " ";
            txtRespuesta.setText(Respuesta);
        }

        mp = MediaPlayer.create(this,R.raw.notification9);
        mp.start();
    }
    public void btn4(View view) {
        res = btnRes4.getText().toString();
        if (Respuesta == ""){
            Respuesta = n4+" ";
            txtRespuesta.setText(Respuesta);
        }else {
            Respuesta = Respuesta + n4 + " ";
            txtRespuesta.setText(Respuesta);
        }

        mp = MediaPlayer.create(this,R.raw.pixiedust2012);
        mp.start();
    }
    public void btn5(View view) {
        res = btnRes5.getText().toString();
        if (Respuesta == ""){
            Respuesta = n5+" ";
            txtRespuesta.setText(Respuesta);
        }else {
            Respuesta = Respuesta + n5 + " ";
            txtRespuesta.setText(Respuesta);
        }

        mp = MediaPlayer.create(this,R.raw.textnotification);
        mp.start();
    }
    public void btn6(View view) {
        res = btnRes6.getText().toString();
        if (Respuesta == ""){
            Respuesta = n6+" ";
            txtRespuesta.setText(Respuesta);
        }else {
            Respuesta = Respuesta + n6 + " ";
            txtRespuesta.setText(Respuesta);
        }

        mp = MediaPlayer.create(this,R.raw.hubblebubble);
        mp.start();
    }
}