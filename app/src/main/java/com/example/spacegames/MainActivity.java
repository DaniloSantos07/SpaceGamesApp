package com.example.spacegames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView usuario = (TextView) findViewById(R.id.usuário);
        TextView senha = (TextView) findViewById(R.id.senha);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usuario.getText().toString().equals("admin") && senha.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "LOGIN FEITO COM SUCESSO", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "LOGIN FALHOU!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }

        });


    }

    


}