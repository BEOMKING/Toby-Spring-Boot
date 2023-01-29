package helloboot.tobyspringboot;

import org.springframework.stereotype.Component;

@MyComponent
public class ComplexHelloService implements HelloService {
    public String sayHello(String name) {
        return "Complex Hello, " + name;
    }
}
