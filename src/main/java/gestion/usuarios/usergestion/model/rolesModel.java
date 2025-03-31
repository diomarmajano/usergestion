package gestion.usuarios.usergestion.model;

public class rolesModel {
    private String id;
    private String nombreRol;
    private String descripcion;

    public rolesModel(String id, String nombreRol, String descripcion) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
    }

    // creación de getters para obtener los datos de los atributos previamente creados.
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
