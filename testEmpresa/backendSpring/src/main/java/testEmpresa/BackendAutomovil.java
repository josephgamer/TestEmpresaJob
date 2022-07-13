package testEmpresa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;

//@SpringBootApplication
public class BackendAutomovil {
    private static final Logger logger = LogManager.getLogger(BackendAutomovil.class);

    public static void main(String[] args) {
        logger.info("Inicializando el Backend");
        /*SpringApplication app = new SpringApplication(BackendAutomovil.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);*/
    }
}
