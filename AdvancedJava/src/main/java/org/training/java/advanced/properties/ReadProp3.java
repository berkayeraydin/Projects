package org.training.java.advanced.properties;

import org.training.java.advanced.reflection.PropertyEngine;
import org.training.java.advanced.reflection.PropertyEngine2;

public class ReadProp3 {
    public static void main(String[] args) throws Exception {
        AppProp2 appProp = new AppProp2();
        PropertyEngine2.fillProperty(appProp);
        System.out.println(appProp);
    }
}
