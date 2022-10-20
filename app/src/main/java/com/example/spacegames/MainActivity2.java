package com.example.spacegames;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView notification = (ImageView) findViewById(R.id.notification);
        ImageView userprofile = (ImageView) findViewById(R.id.userprofile);
        ImageView desccupons = (ImageView) findViewById(R.id.desccupons);
        Button obterstray = (Button) findViewById(R.id.obterstray);
        Button obterark = (Button) findViewById(R.id.obterark);
        Button obterb4b = (Button) findViewById(R.id.obterb4b);
        Button obterfc = (Button) findViewById(R.id.obterfc);
        TextView textstray = (TextView) findViewById(R.id.textstray);
        TextView textark = (TextView) findViewById(R.id.textsark);
        TextView textsb4b = (TextView) findViewById(R.id.textb4b);
        TextView textfarcry = (TextView) findViewById(R.id.textfarcry);




        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Sem Novas Notificações!", Toast.LENGTH_LONG).show();

            }
        });

        desccupons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Description.class);
                startActivity(intent);
            }
        });


        userprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PerfilUsuario.class);
                startActivity(intent);
            }
        });

        obterstray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setEnabled(false);
                Button obterstray = (Button) view;
                obterstray.setText("OBTIDO!");
                Toast.makeText(MainActivity2.this,"Cupom de Stray para PC foi Obtido. Resgate agora!", Toast.LENGTH_LONG).show();
                textstray.setText("STRAY30%");
            }
        });

        obterark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setEnabled(false);
                Button obterark = (Button) view;
                obterark.setText("OBTIDO!");
                Toast.makeText(MainActivity2.this,"Cupom de Ark para PC foi Obtido. Resgate agora!", Toast.LENGTH_LONG).show();
                textark.setText("ARK30%");
            }
        });

        obterb4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setEnabled(false);
                Button obterb4b = (Button) view;
                obterb4b.setText("OBTIDO!");
                Toast.makeText(MainActivity2.this,"Cupom de Back 4 Blood para PS5 foi Obtido. Resgate agora!", Toast.LENGTH_LONG).show();
                textsb4b.setText("BACK4BLOOD30%");
            }
        });

        obterfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setEnabled(false);
                Button obterfc = (Button) view;
                obterfc.setText("OBTIDO!");
                Toast.makeText(MainActivity2.this,"Cupom de Far Cry 6 para Xbox foi Obtido. Resgate agora!", Toast.LENGTH_LONG).show();
                textfarcry.setText("FARCRY630%");
            }
        });

    }

}
