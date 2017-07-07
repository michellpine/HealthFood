package pcamov01cv.healthfood.model;

import java.sql.Array;
import java.util.ArrayList;

public class Producto {

    private String nombre;
    private String ingredientes;
    private String precio;
    private String image;
    private String comentarios;
    //private boolean favorito;


    public Producto(String nombre, String ingredientes, String precio, String image, String comentarios) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.image = image;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}