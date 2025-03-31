package gestion.usuarios.usergestion.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import gestion.usuarios.usergestion.model.userModel;

@Service
public class userRepository {

    private List<userModel> usuarios = new ArrayList<>();

    // Este constructor crea una lista en memoria de los usuarios, en lugar de usar una base de datos.
    public userRepository(){
        usuarios.add(new userModel(1, "Diomar", "Majano", "diomar@gmail.com", "123456", "San Salvador", "DDM"));
        usuarios.add(new userModel(2, "Carlos", "Perez", "carlos.perez@gmail.com", "654321", "Lima", "CTP"));
        usuarios.add(new userModel(3, "Ana", "Lopez", "ana.lopez@gmail.com", "abcdef", "Bogotá", "DDM"));
        usuarios.add(new userModel(4, "Luis", "Martinez", "luis.martinez@gmail.com", "123abc", "Quito", "CTP"));
        usuarios.add(new userModel(5, "Maria", "Gomez", "maria.gomez@gmail.com", "pass123", "Santiago", "DDM"));
        usuarios.add(new userModel(6, "Jose", "Hernandez", "jose.hernandez@gmail.com", "qwerty", "Buenos Aires", "CTP"));
        usuarios.add(new userModel(7, "Lucia", "Ramirez", "lucia.ramirez@gmail.com", "zxcvbn", "Caracas", "DDM"));
        usuarios.add(new userModel(8, "Miguel", "Torres", "miguel.torres@gmail.com", "mypass", "Montevideo", "CTP"));
        usuarios.add(new userModel(9, "Sofia", "Diaz", "sofia.diaz@gmail.com", "secure1", "Asunción", "DDM"));
        usuarios.add(new userModel(10, "Fernando", "Castro", "fernando.castro@gmail.com", "admin123", "La Paz", "CTP"));
    }

    // estamos creando este metodo para que el controlador pueda acceder a la lista de usuarios y obtener los datos de cada uno
    public List<userModel> obtenerUsuarios() {
        return usuarios;
    }

    // Este método permite obtener un usuario específico por su id
    public userModel obtenerUsuarioPorId(int id) {
        for (userModel usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
