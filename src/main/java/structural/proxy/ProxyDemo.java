package main.java.structural.proxy;

import java.lang.reflect.Proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        Animal realSubject = new Lion();
        Animal proxy = (Animal) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), new AnimalInvoke(realSubject) );
        proxy.getSound();

    }
}
