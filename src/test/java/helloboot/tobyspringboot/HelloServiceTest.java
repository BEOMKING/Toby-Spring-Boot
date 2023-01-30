package helloboot.tobyspringboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {
    @Test
    void simpleHelloServiceTest() {
        HelloService helloService = new SimpleHelloService();

        String ret = helloService.sayHello("Spring");

        assertThat(ret).isEqualTo("Hello, Spring");
    }

}
