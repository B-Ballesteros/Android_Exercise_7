package itesm.mx.m1_jbbm_labo_libros;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity implements View.OnClickListener{

    String isbn, fechaPublicacin, titulo;
    int idImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView tvTitulo = (TextView)findViewById(R.id.text_valorTitulo);
        TextView tvIsbn = (TextView)findViewById(R.id.text_valorIsbn);
        TextView tvFecha = (TextView)findViewById(R.id.text_valorFecha);
        ImageView ivLibro = (ImageView)findViewById(R.id.image_libro);
        Button btnAceptar = (Button)findViewById(R.id.button_ok);

        Intent intent  = getIntent();
        if(intent.getExtras() != null){
            isbn = intent.getStringExtra("isbn");
            fechaPublicacin = intent.getStringExtra("fechaPublicacion");
            titulo = intent.getStringExtra("titulo");
            idImagen = intent.getIntExtra("imagen", R.mipmap.ic_launcher);
            tvTitulo.setText(titulo);
            tvIsbn.setText(isbn);
            tvFecha.setText(fechaPublicacin);
            Drawable drawable = ContextCompat.getDrawable(this, idImagen);
            ivLibro.setImageDrawable(drawable);
        }

        btnAceptar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        finish();
    }
}
