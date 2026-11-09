import java.net.*;

public class User {
    
    private String username;

    private InetAddress address;

    private int port;

    public User(String name, InetAddress addr, int port) {
        this.username = name;
        this.address = addr;
        this.port = port;
    }

    public InetAddress getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public int getPort() {
        return port;
    }

    public void setAddress(InetAddress address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
