package helloboot.tobyspringboot;

import java.util.Objects;

public class HelloController {
    public String hello(String name) {
        SimpleHelloService simpleHelloService = new SimpleHelloService();
        return simpleHelloService.simpleHello(Objects.requireNonNull(name));
    }
}
