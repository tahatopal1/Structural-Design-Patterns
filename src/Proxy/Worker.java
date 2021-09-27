package Proxy;

public class Worker {

    private String username;
    private String password;
    private boolean isManager;

    public Worker(String username, String password, boolean isManager) {
        this.username = username;
        this.password = password;
        this.isManager = isManager;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
