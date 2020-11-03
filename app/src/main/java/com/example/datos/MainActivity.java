package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public  static  final String EXTRA_MESSAGE ="com.example.datos.MESSAGE";
   // Button btnEnviar = findViewById(R.id.btnEnviar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  sendMenssage(View view){
        EditText etMensaje=findViewById(R.id.etMensaje),
                etEmail =findViewById(R.id.etEmail),
                etAsunto=findViewById(R.id.etAsunto),
                etNombre=findViewById(R.id.etNombre);
        final Intent enviarMensaje= new Intent(this, DisplayMessageActivity.class);
        String nombre =etNombre.getText().toString();
        String email =etEmail.getText().toString();
        String asunto =etAsunto.getText().toString();
        String mensaje =etMensaje.getText().toString();
        String message ="Nombre: "+ nombre +
                "\nEmail: " + email+
                "\nAsunto: "+ asunto+
                "\n Mensaje: "+mensaje;
        enviarMensaje.putExtra(EXTRA_MESSAGE,message);
        startActivity(enviarMensaje);
    }
    public  void  LimpiarFormulario(View view){
        EditText etNombre=findViewById(R.id.etNombre),
                etEmail =findViewById(R.id.etEmail),
                etAsunto=findViewById(R.id.etAsunto),
                etMensaje=findViewById(R.id.etMensaje);
        etNombre.setText("");
        etEmail.setText("");
        etAsunto.setText("");
        etMensaje.setText("");
    }
}