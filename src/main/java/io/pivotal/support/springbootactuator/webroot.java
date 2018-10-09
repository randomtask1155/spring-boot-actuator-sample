package io.pivotal.support.springbootactuator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by danl on 10/9/18.
 */
@RestController
public class webroot {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
