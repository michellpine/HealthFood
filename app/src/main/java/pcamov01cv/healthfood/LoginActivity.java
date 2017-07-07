package pcamov01cv.healthfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import pcamov01cv.healthfood.model.Producto;
import pcamov01cv.healthfood.model.Usuario;
import pcamov01cv.healthfood.view.CrearCuentaActivity;
import pcamov01cv.healthfood.view.VerProductosActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goHome(View view){
        final Intent intent = new Intent(this, VerProductosActivity.class);
        final EditText username = (EditText)findViewById(R.id.username);
        final EditText password = (EditText)findViewById(R.id.password);
        Button login      = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario user = new Usuario("Michell Pineda", "michell@b.com", "dmpineda", "123", "Calle 2 #2", "123445", buidPictures());
                if(username.getText().toString().equals(user.getUsuario()) &&
                        password.getText().toString().equals(user.getClave())) {
                    Toast.makeText(getApplicationContext(),
                            "Ingresando...", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Datos incorrectos",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CrearCuentaActivity.class);
        startActivity(intent);
    }

    public ArrayList<Producto> buidPictures() {
        ArrayList<Producto> producto = new ArrayList<>();
        producto.add(new Producto("Empanada Argentina", "", "$3.5000", "http://fondaargentina.com/wp-content/uploads/2014/11/11549.jpg", "Laura Londoño: deliciosa, con muy buena sazón. \n Marcela Perez: demasiada grasa! \n Daniel Lopez: muy buena \n Alejandro Pineda: muy caras para su tamaño \n David Gomez: recomendales" ));
        return producto;
    }

}
