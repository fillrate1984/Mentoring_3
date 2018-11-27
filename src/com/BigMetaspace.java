package com;

import java.lang.reflect.Proxy;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedList;
import java.util.List;

public class BigMetaspace {
    private static List classes = new LinkedList();

    public static void feelMetaspace() {
        while (true) {
            classes.add(Proxy.getProxyClass(new URLClassLoader(new URL[]{}), FakeURL.class));
        }
    }
}
