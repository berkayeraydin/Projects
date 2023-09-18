package org.training.java.advanced.properties;

import org.training.java.advanced.reflection.PropertyEngine;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProp2 {
    public static void main(String[] args) throws Exception {
        AppProp appProp = new AppProp();
        PropertyEngine.fillProperty(appProp);
        System.out.println(appProp);
        ExtraProp extraProp = new ExtraProp();
        PropertyEngine.fillProperty(extraProp);
        System.out.println(extraProp);
    }
}
