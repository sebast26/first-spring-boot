package pl.sgorecki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
