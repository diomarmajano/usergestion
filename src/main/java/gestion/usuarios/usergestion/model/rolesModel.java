package gestion.usuarios.usergestion.model;

public class rolesModel {
    private int id;
    private String cod;
    private String nombreRol;
    private String descripcion;

    public rolesModel(int id, String cod, String nombreRol, String descripcion) {
        this.cod = cod;
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
    }

    // creación de getters para obtener los datos de los atributos previamente creados.
    public int getId() {
        return id;
    }
    public String getCod() {
        return cod;
    }

    public String getNombre() {
        return nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
