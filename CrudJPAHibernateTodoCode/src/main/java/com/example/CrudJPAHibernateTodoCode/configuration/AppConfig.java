package com.example.CrudJPAHibernateTodoCode.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Como mencionamos anteriormente, en esta ocasión, será nuestro microservicio turnos quien consuma al microservicio pacientes.
 * Para ello, nos dirigiremos al paquete principal de nuestro microservicio (podemos también crear un paquete nuevo
 * llamado configuration si queremos hacerlo más ordenado) y crearemos una nueva clase de configuración llamada AppConfig
 * y vamos a marcarla con la annotation @Configuration, tal como podemos ver a continuación:
 */
@Configuration
public class AppConfig {
    @Bean("apiConsumir")
    public RestTemplate registrarRestTemplate() {
        return new RestTemplate();
    }
}
