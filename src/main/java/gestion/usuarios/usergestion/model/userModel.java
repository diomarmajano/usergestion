package gestion.usuarios.usergestion.model;

public class userModel {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String direccion;
    private String rol;

    public userModel(int id, String nombre, String apellido, String email, String password,  String direccion, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.direccion = direccion;
        this.rol = rol;
    }
    // creación de getters para obtener los datos de los atributos previamente creados.
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getRol() {
        return rol;
    }
}
