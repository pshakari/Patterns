package main.java.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvoke implements InvocationHandler {
    private Object realObject = null;

    public AnimalInvoke(Object realObject) {
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = null;

        try {
            result = method.invoke(realObject,objects);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
