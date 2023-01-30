package helloboot.tobyspringboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloApiTest {
    @Test
    void helloApi() {
        TestRestTemplate testRestTemplate = new TestRestTemplate();

        ResponseEntity<String> result = testRestTemplate.getForEntity("http://localhost:8080/hello?name={name}", String.class, "Spring");

        assertAll(() -> {
            assertEquals("*Complex Hello, Spring*", result.getBody());
            assertEquals(200, result.getStatusCodeValue());
        });
    }
}
