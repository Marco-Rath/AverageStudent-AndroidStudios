package com.example.notasestudiante;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText nombre,codigo,nota1,nota2,nota3;
    TextView etiNombre,etiCodigo,etiPromedio,etiBienvenido,etiImagen;
   // ImageView miImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.txtNombre);
        codigo=findViewById(R.id.txtCodigo);
        nota1=findViewById(R.id.txtNota1);
        nota2=findViewById(R.id.txtNota2);
        nota3=findViewById(R.id.txtNota3);
        etiBienvenido=findViewById(R.id.etiBienvenido);
        etiNombre=findViewById(R.id.etiNombre);
        etiCodigo=findViewById(R.id.etiCodigo);
        etiPromedio=findViewById(R.id.etiPromedio);
        //miImagen = findViewById(R.id.miImagen);
    }

    public void evento(View view) {
        if(view.getId() == R.id.btnIngresar){
            int notas1 = Integer.parseInt(nota1.getText().toString());
            int notas2 = Integer.parseInt(nota2.getText().toString());
            int notas3 = Integer.parseInt(nota3.getText().toString());
            float promedio = ((notas1*0.5f) + (notas2*0.4f) + (notas3*0.1f));
            String etiBienvenidos = "* Bienvenido *";
            String nombres = nombre.getText().toString();

            int codigos = Integer.parseInt(codigo.getText().toString());
            // Determinar la imagen basada en el promedio
            /*int imagenId;
            if (promedio >= 11) {
                imagenId = R.drawable.bien;
            } else if (promedio < 11 && promedio > 8) {
                imagenId = R.drawable.mal;
            } else {
                imagenId = R.drawable.repro;
            }

            // Actualizar la imagen en el ImageView
            miImagen.setImageResource(imagenId);*/

            // Corrección: Asignación de los valores a los TextViews
            etiBienvenido.setText(etiBienvenidos);
            etiNombre.setText(nombres);
            etiCodigo.setText(String.valueOf(codigos)); // Convertir el código a String
            etiPromedio.setText(String.format("%.2f", promedio)); // Formatear el promedio con dos decimales
        }
    }

}