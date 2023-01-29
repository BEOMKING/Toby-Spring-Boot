package helloboot.tobyspringboot;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class TobySpringBootApplication {
    @Bean
    public HelloController helloController(HelloService helloService) {
        return new HelloController(helloService);
    }

    @Bean
    public HelloService helloService() {
        return new ComplexHelloService();
    }

    public static void main(String[] args) {
        // Spring Container
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext() {
            @Override
            protected void onRefresh() {
                // Servlet Container (Web Application Server)
                ServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();

                WebServer webServer = serverFactory.getWebServer(servletContext ->
                        servletContext.addServlet("dispatcherServlet",
                                new DispatcherServlet(this)
                        ).addMapping("/*")
                );
                webServer.start();
//                getServletContext().setAttribute(
//                    DispatcherServlet.WEB_APPLICATION_CONTEXT_ATTRIBUTE, this);
                super.onRefresh();
            }
        };

        context.register(TobySpringBootApplication.class);
        context.refresh();
    }
    
}
