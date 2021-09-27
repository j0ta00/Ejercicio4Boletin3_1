package com.example.juanjomz.ejercicios3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.imageView);
        img.setImageResource(R.drawable.descarga);
        img.setTag("descarga");
        btn1=findViewById(R.id.button);
        btn1.setOnClickListener(x->cambiarImagen());
        btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(x->cambiarImagen());
    }

    public void cambiarImagen() {
        if (img.getTag() == "descarga") {
            img.setImageResource(R.drawable.p);
            img.setTag("p");
        } else {
            img.setImageResource(R.drawable.descarga);
            img.setTag("descarga");
        }

    }
}