import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerMain {
    private static final Logger LOGGER = LogManager.getLogger(HelloWorld.class);
    public static void main(String[] args){
        LOGGER.error("Hello World !");
    }
}
