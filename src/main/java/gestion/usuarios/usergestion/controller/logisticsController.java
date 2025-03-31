package gestion.usuarios.usergestion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import gestion.usuarios.usergestion.repository.userRepository;
import gestion.usuarios.usergestion.repository.rolesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import gestion.usuarios.usergestion.model.rolesModel;
import gestion.usuarios.usergestion.model.userModel;

@RestController
class LogisticsController {
   
    @Autowired
    private rolesRepository rolesRepository;

    @Autowired
    private userRepository userRepository;
    
    //enpoint de usuarios
    @GetMapping("/usuarios")
    public List<userModel> getUsuarios() {
        return userRepository.obtenerUsuarios();
    }
    @GetMapping("/usuarios/{id}")
    public userModel getUsuarioPorId(@PathVariable int id) {
        return userRepository.obtenerUsuarioPorId(id);
    }
    
    //enpoint de roles
    @GetMapping("/roles")
    public List<rolesModel> getRoles() {
        return rolesRepository.obtenerRoles();
    }
    @GetMapping("/roles/{id}")
    public rolesModel getRolPorId(@PathVariable int id) {
        return rolesRepository.obtenerRolPorId(id);
    }

}
