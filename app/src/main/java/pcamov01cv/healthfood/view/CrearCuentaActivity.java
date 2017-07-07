package pcamov01cv.healthfood.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import pcamov01cv.healthfood.R;
import pcamov01cv.healthfood.model.Producto;
import pcamov01cv.healthfood.model.Usuario;

public class CrearCuentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
        showToolbar(getResources().getString(R.string.toolbar_tittle_createaccount), true);

        final Intent intent      = new Intent(this, VerProductosActivity.class);
        final EditText nombre    = (EditText)findViewById(R.id.name);
        final EditText correo    = (EditText)findViewById(R.id.email);
        final EditText usuario   = (EditText)findViewById(R.id.user);
        final EditText clave     = (EditText)findViewById(R.id.password_createaccount);
        final EditText direccion = (EditText)findViewById(R.id.direccion);
        final EditText telefono  = (EditText)findViewById(R.id.telefono);
        Button join              = (Button) findViewById(R.id.joinUs);

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario user = new Usuario(nombre.getText().toString(), correo.getText().toString(), usuario.getText().toString(), clave.getText().toString(), direccion.getText().toString(), telefono.getText().toString(), buidPictures());
                Toast.makeText(getApplicationContext(), "Usuario Guardado!",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
    public ArrayList<Producto> buidPictures() {
        ArrayList<Producto> producto = new ArrayList<>();
        producto.add(new Producto("Empanada Argentina", "", "$3.5000", "http://fondaargentina.com/wp-content/uploads/2014/11/11549.jpg", "Laura Londoño: deliciosa, con muy buena sazón. \n Marcela Perez: demasiada grasa! \n Daniel Lopez: muy buena \n Alejandro Pineda: muy caras para su tamaño \n David Gomez: recomendales" ));
        return producto;
    }






}
