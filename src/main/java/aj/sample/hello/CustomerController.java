package aj.sample.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @RequestMapping("/customers")
    public String get() {
        logger.debug("get() - Enter");
        return "Hello Customers!";
    }

}
