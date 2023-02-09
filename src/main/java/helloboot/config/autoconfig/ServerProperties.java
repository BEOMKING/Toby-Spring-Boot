package helloboot.config.autoconfig;

public class ServerProperties {
    String contextPath;
    int port;

    public String getContextPath() {
        return contextPath;
    }

    public int getPort() {
        return port;
    }

    public void setContextPath(final String contextPath) {
        this.contextPath = contextPath;
    }

    public void setPort(final int port) {
        this.port = port;
    }
}
