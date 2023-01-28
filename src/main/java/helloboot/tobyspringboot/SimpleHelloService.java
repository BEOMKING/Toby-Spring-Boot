package helloboot.tobyspringboot;

public class SimpleHelloService implements HelloService {
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
