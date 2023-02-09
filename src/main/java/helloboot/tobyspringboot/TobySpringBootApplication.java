package helloboot.tobyspringboot;

import helloboot.config.MySpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@MySpringBootApplication
public class TobySpringBootApplication {
    @Bean
    ApplicationRunner applicationRunner(Environment environment) {
        return args -> System.out.print(environment.getProperty("app.name"));
    }

    public static void main(String[] args) {
        SpringApplication.run(TobySpringBootApplication.class, args);
    }

}
