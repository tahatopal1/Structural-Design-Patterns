package Proxy;

import java.math.BigDecimal;

public class ProxyManager implements CompanyInfo{

    private ActualManager actualManager;

    private String username;
    private String password;

    public ProxyManager(String username, String password) {
        actualManager = new ActualManager();
        this.username = username;
        this.password = password;
    }

    private boolean isUserManager(){

        boolean isUserManager = false;

        boolean isWorkerValid = WorkerUtil.isWorkerValid(username, password);

        if (isWorkerValid){
            Worker worker = WorkerUtil.getWorkerByUsername(username);
            isUserManager = worker.isManager();
        }

        return isUserManager;

    }

    @Override
    public BigDecimal getEndorsement() throws IllegalAccessException {

        boolean isUserManager = isUserManager();
        if (isUserManager)
            return actualManager.getEndorsement();
        else
            throw new IllegalAccessException("You're not allowed to access this source.");

    }
}
