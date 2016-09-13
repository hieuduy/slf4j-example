import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hieudang on 9/13/2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

        logger.debug("Says hello to {}", "Hieu Dang");
    }
}
