package pe.edu.idat.demo_spring_feign_client.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_spring_feign_client.restclient.placeholder.clientservice.UserClient;
import pe.edu.idat.demo_spring_feign_client.restclient.placeholder.model.User;

import java.util.List;

@Service
public class UserService {
    private final UserClient userClient;
    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    public List<User> obtenerUsuarios(){
        return userClient.obtenerUsuarios();
    }
}
