package gestion.usuarios.usergestion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import gestion.usuarios.usergestion.repository.userRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import gestion.usuarios.usergestion.model.userModel;

@RestController
class userController {
    @Autowired
    private userRepository userRepository;

    @GetMapping("/usuarios")
    public List<userModel> getUsuarios() {
        return userRepository.obtenerUsuarios();
    }
    @GetMapping("/usuarios/{id}")
    public userModel getUsuarioPorId(@PathVariable int id) {
        return userRepository.obtenerUsuarioPorId(id);
    }
    
}
