package com.asong.principal;


import com.asong.agency.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 媒人
 */
public class GoBetween implements InvocationHandler {
    Person target;
    public GoBetween(Person target) {
        this.target = target;
    }

    public Object getInstance() {
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒人");

        target.findObject();
        method.invoke(target,args);

        System.out.println("大家有意积极参与");
        return null;
    }
}
