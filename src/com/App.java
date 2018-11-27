package com;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

            manyConcatenations();

    }

    public static void metaspaseError() throws Exception {
        ArrayList<Class> classes = new ArrayList<>();
        for (int i = 0; ; i++) {

        }
    }

    public static void stackOverflowError2() {
        for (int i = 0; i < 100000; i++) {

        }
    }


    public static void stackOverflowError() {
        stackOverflowError();
    }

    public static void bigObjects() {
        for (int i = 0; i < 10000; i++) {
            new Class1("Value");
        }
    }

    public static void manyConcatenations() {
        String str1 = "i'm big ";
        for (int i = 0; i < 1_000_000_000; i++) {
            str1 += str1;
        }
    }
}
