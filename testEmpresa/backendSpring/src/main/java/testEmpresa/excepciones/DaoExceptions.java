package testEmpresa.excepciones;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaoExceptions extends Exception{
    private static final Logger logger = LogManager.getLogger(DaoExceptions.class);

    public DaoExceptions(String message) {
        super(message);
        logger.error("Error importante - Capa DAO");
    }

    public DaoExceptions(String message, Throwable cause) {
        super(message, cause);
        logger.error("Error importante - Capa DAO", cause);
    }
}
