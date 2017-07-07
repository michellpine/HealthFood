package pcamov01cv.healthfood.view;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import pcamov01cv.healthfood.R;
import pcamov01cv.healthfood.model.Producto;

import static pcamov01cv.healthfood.R.id.fab;

public class ProductoDetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_detalle);
        showToolbar(getResources().getString(R.string.Informacion), true);

        String imagen = getIntent().getStringExtra("imagen");
        ImageView viewImage = (ImageView) findViewById(R.id.imageHeader);
        Picasso.with(this).load(imagen).into(viewImage);

        String nombre = getIntent().getStringExtra("nombre");
        TextView textNombre = (TextView) findViewById(R.id.producNameDetail);
        textNombre.setText(nombre);

        String descripcion = getIntent().getStringExtra("descripcion");
        TextView textDesc = (TextView) findViewById(R.id.descripcion);
        textDesc.setText(descripcion);

        String comentarios = getIntent().getStringExtra("comentarios");
        TextView textComen = (TextView) findViewById(R.id.comentarios);
        textComen.setText(comentarios);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView favorito = (ImageView) findViewById(R.id.checkFavorito);
                favorito.setImageResource(R.drawable.heart_full);

            }
        });
    }


    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
