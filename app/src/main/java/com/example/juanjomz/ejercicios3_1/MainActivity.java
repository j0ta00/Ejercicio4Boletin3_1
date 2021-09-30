package com.example.juanjomz.ejercicios3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnLeft,btnRight;
    private ImageView img;
    private int[] imagesId;
    private int positionImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        positionImg=1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView);
        btnLeft=findViewById(R.id.btnLeft);
        btnRight=findViewById(R.id.btnRight);
        imagesId= new int[]{R.drawable.manchon,R.drawable.android,R.drawable.gafas};
        img.setImageResource(imagesId[positionImg]);
        btnRight.setOnClickListener(x->cambiarImagenHaciaLaDerecha());
        btnLeft.setOnClickListener(x->cambiarImagenHaciaLaIzquierda());
    }

    public void cambiarImagenHaciaLaDerecha() {
        int idImage=0;
        if(imagesId[imagesId.length-1]==imagesId[positionImg]){
            idImage=imagesId[0];
            positionImg=0;
        }else{
            idImage=imagesId[++positionImg];
        }
        img.setImageResource(idImage);
    }
    public void cambiarImagenHaciaLaIzquierda() {
        int idImage=0;
        if(imagesId[0]==imagesId[positionImg]){
            idImage=imagesId[imagesId.length-1];
            positionImg=imagesId.length-1;
        }else{
            idImage=imagesId[--positionImg];
        }
        img.setImageResource(idImage);
    }
}