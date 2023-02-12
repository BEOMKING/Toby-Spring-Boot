package helloboot.tobyspringboot;

import helloboot.config.MyComponent;

public class ComplexHelloService implements HelloService {
    public String sayHello(String name) {
        return "Complex Hello, " + name;
    }
}
