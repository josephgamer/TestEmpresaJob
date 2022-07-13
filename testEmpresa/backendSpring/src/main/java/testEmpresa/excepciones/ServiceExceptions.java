package testEmpresa.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceExceptions extends Exception{
    private static final Logger logger = LogManager.getLogger(ServiceExceptions.class);

    public ServiceExceptions(String message) {
        super(message);
        logger.error("Error importante - Capa Service");
    }

    public ServiceExceptions(String message, Throwable cause) {
        super(message, cause);
        logger.error("Error importante - Capa Service", cause);
    }
}
