package helloboot.tobyspringboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@MySpringBootTest
class HelloJdbcRepositoryTest {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    HelloRepository helloRepository;

    @Test
    void findHelloFailed() {
        assertThat(helloRepository.findHello("hello")).isNull();
    }

    @Test
    void increaseCountTest() {
        assertThat(helloRepository.countOf("hello")).isEqualTo(0);

        helloRepository.increaseHello("hello");
        assertThat(helloRepository.countOf("hello")).isEqualTo(1);

        helloRepository.increaseHello("hello");
        assertThat(helloRepository.countOf("hello")).isEqualTo(2);
    }
}
