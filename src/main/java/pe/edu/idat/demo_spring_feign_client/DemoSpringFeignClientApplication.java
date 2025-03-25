package pe.edu.idat.demo_spring_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoSpringFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringFeignClientApplication.class, args);
	}

}
