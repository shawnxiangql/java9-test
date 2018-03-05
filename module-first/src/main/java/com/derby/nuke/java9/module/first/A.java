package com.derby.nuke.java9.module.first;

/**
 * Created by xql on 18-3-5.
 */
public class A {

    public String sayHello(String name) {
        return sayHello() + name;
    }

    public String sayHello() {
        return "module A: hello ";
    }
}
