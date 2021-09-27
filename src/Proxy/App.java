package Proxy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        ProxyManager proxyManager = new ProxyManager("Jonathan", "1234");
        BigDecimal endorsement = null;
        try {
            endorsement = proxyManager.getEndorsement();
            System.out.println("Endorsement of company: " + endorsement);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        proxyManager = new ProxyManager("1Josef", "12345");
        try {
            endorsement = proxyManager.getEndorsement();
            System.out.println("Endorsement of company: " + endorsement);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

    }
}