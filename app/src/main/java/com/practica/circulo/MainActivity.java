package com.practica.circulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //creamos una Activity y le asociamos un objeto View, creado en el constructor de la
        //clase DibujaCirculo
        setContentView(new DibujaCirculo(this));
    }

    //clase que hereda de View
    public class DibujaCirculo extends View {

        //constructor. Establece la vista mediante el contexto recibido de la actividad
        //que lo invoca
        public DibujaCirculo(Context context) {
            super(context);
        }

        //sobreescribimos el método onDraw de la clase View, que será el responsable de
        //dibujar la vista mediante un objeto de la clase Canvas que recibe como parámetro
        @Override
        protected void onDraw(Canvas canvas) {
            //instanciamos un objeto de la clase Paint. Esta clase representa un pincel, por tanto,
            //define el estilo y el color con los que vamos a dibujar.
            Paint pincel = new Paint();
            //establecemos el color del pincel, en este caso, azul.
            pincel.setColor(Color.BLUE);
            //definimos el grosor del trazado
            pincel.setStrokeWidth(8);
            //el estilo del trazado lo establecemos con la primitiva STROKE, para que dibuje solo
            //el contorno del círculo.
            pincel.setStyle(Paint.Style.STROKE);
            //dibujamos el círculo mediante el siguiente método de la clase Canvas, al que le
            //pasamos las coordenadas, el radio y el pincel
            canvas.drawCircle(150, 150, 100, pincel);



            //b) DIBUJAR EL CIRCULO CENTRADO Y UTILIZAR UN COLOR DE LOS RECURSOS

            //obtenemos el ancho y el alto de la pantalla
            int ancho = this.getWidth();
            int alto = this.getHeight();
            //establecemos el color del pincel mediante el recurso definido en el archivo
            //colors.xml
            pincel.setColor(getResources().getColor(R.color.color_circulo));
            //dibujamos de nuevo el círculo
            canvas.drawCircle(ancho/2, alto/2, 100, pincel);

        }
    }
}
























