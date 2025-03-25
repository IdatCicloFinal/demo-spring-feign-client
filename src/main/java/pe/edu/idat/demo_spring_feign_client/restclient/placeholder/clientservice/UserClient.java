package pe.edu.idat.demo_spring_feign_client.restclient.placeholder.clientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.idat.demo_spring_feign_client.restclient.placeholder.model.User;

import java.util.List;

@FeignClient(name = "placeholder-user",
url = "https://jsonplaceholder.typicode.com")
public interface UserClient {

    @GetMapping("/users")
    List<User> obtenerUsuarios();

    @GetMapping("/users/{id}")
    User obtenerUsuarioxId(@PathVariable Long id);
}
