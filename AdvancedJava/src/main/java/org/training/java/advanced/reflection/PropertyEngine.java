package org.training.java.advanced.reflection;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class PropertyEngine {

    public static void fillProperty(Object obj) throws Exception{
        Class<?> aClass = obj.getClass();
        PropFile propFile = aClass.getAnnotation(PropFile.class);
        if (propFile != null){
            Properties properties = new Properties();
            String value = propFile.value();
            File file = new File("my.properties");
            InputStream inputStream = new FileInputStream(file);
            properties.load(inputStream);
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field field:declaredFields) {
                Prop prop = field.getAnnotation(Prop.class);
                if (prop != null){
                    field.setAccessible(true);
                    String propKey = prop.value();
                    String property = properties.getProperty(propKey);
                    if (property != null){
                        Class<?> type = field.getType();
                        String name = type.getName();
                        switch (name){
                            case "java.lang.String":
                                field.set(obj,property);
                                break;
                            case "int":
                                field.setInt(obj,Integer.parseInt(property));
                                break;
                        }
                    }
                }
            }
        }
    }
}
