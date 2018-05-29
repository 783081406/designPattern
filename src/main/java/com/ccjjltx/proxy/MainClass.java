package com.ccjjltx.proxy;

public class MainClass {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        realSubject.sailBook();

        ProxySubject proxySubject = new ProxySubject();
        proxySubject.setRealSubject(new RealSubject());
        realSubject.sailBook();
    }
}
