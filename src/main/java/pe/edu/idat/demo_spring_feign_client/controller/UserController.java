package pe.edu.idat.demo_spring_feign_client.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.demo_spring_feign_client.restclient.placeholder.model.User;
import pe.edu.idat.demo_spring_feign_client.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest-client/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> obtenerUsuarios(){
        return new ResponseEntity<>(
                userService.obtenerUsuarios(),
                HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> obtenerUsuarioxId(
            @PathVariable Long id){
        return new ResponseEntity<>(
                userService.obtenerUsuarioxId(id),
                HttpStatus.OK);
    }
}
