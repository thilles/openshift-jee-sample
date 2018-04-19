
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.splunk.logging.*;
 
/**
 * 
 * @author Thomas
 * @version 1.0
 */
public class LogbackHello {
    private static final Logger splunklogger = LoggerFactory.getLogger(loggerName);
 
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        splunklogger.trace("Hello World!");
         
        String name = "Thomas";
        splunklogger.debug("Hi, {}", name);
        splunklogger.info("Welcome to the HelloWorld example of Logback.");
        splunklogger.warn("Dummy warning message.");
        splunklogger.error("Dummy error message.");
    }
}