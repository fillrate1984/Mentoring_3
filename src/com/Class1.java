package com;

import java.io.*;

public class Class1 {

    String lines;
    private static Class1 class1 = null;
    private Class1 prevNode;
    private Class2 class2;

    public Class1(Class2 class2) {
        this.class2 = class2;
    }

    public Class1(String value) {
        if (class1 != null) {
            prevNode = class1;
        }

        for (int i = 0; i < 100; i++) {
            lines = value;
            lines += lines;
        }

        class1 = this;
    }

    public Class1() {
        if (class1 != null) {
            prevNode = class1;
        }
        class1 = this;
    }

    @SuppressWarnings("all")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object utilized");
    }
}
