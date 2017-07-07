package pcamov01cv.healthfood.model;


import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String correo;
    private String usuario;
    private String clave;
    private String direccion;
    private String telefono;
    private ArrayList<Producto> favorito;

    public Usuario(String nombre, String correo, String usuario, String clave, String direccion, String telefono, ArrayList<Producto> favorito) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
        this.direccion = direccion;
        this.telefono = telefono;
        this.favorito = favorito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Producto> getFavorito() {
        return favorito;
    }

    public void setFavorito(ArrayList<Producto> favorito) {
        this.favorito = favorito;
    }
}
