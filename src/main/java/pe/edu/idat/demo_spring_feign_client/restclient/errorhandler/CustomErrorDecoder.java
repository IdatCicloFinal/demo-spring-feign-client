package pe.edu.idat.demo_spring_feign_client.restclient.errorhandler;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        HttpStatus status = HttpStatus.valueOf(response.status());
        switch (status){
            case NOT_FOUND:
                return new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "El recurso no fue encontrado");
            case BAD_REQUEST:
                return new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Solicitud incorrecta al API");
            default:
                return new Exception("Error desconocido " + status);
        }
    }
}
