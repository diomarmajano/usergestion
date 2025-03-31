package gestion.usuarios.usergestion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import gestion.usuarios.usergestion.model.rolesModel;

@Repository
public class rolesRepository {
    private List<rolesModel> roles = new ArrayList<>();
    // Este constructor crea una lista en memoria de los roles
    public rolesRepository() {
        roles.add(new rolesModel(1,"DDM", "dueño de mascota", "Rol con acceso a informacion de sus mascotas"));
        roles.add(new rolesModel(2,"CTP", "conductor de transporte pet-friendly", "Rol con acceso a las mascotas asignadas, informacion de ruta, informacion de dueño de mascota"));
    }

    public List<rolesModel> obtenerRoles() {
        return roles;
    }
    public rolesModel obtenerRolPorId(int id) {
        for (rolesModel rol : roles) {
            if (rol.getId() == id) {
                return rol;
            }
        }
        return null;
    }
}
