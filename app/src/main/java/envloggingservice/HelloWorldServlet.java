package envloggingservice;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Create a logger instance for this class
    private static final Logger logger = LogManager.getLogger(HelloWorldServlet.class);

    // Constructor to log initialization
    public HelloWorldServlet() {
        super();
        logger.info("HelloWorldServlet initialized and Logger is set up");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logging at different levels
        logger.debug("This is a DEBUG message");
        logger.trace("This is a TRACE message");
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");

        // Respond with a simple message
        response.setContentType("text/plain");
        response.getWriter().write("Hello, World!");
    }
}
