package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        TextView txtRecibeMensaje= findViewById(R.id.txtRecibeMensaje);
        Intent recibeMensaje= getIntent();
        String mensaje=recibeMensaje.getStringExtra(MainActivity.EXTRA_MESSAGE);
        txtRecibeMensaje.setText(mensaje);
    }
}