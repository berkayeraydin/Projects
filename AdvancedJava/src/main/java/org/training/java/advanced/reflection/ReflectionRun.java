package org.training.java.advanced.reflection;

import org.training.java.advanced.annotations.MyAnno;
import org.training.java.advanced.annotations.MyClass;
import org.training.java.advanced.files.FileRead;
import org.training.java.advanced.streams.Customer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionRun {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // 1. yöntem
        Class<MyClass> myClassClass = MyClass.class;
        Class<FileRead> fileReadClass = FileRead.class;
        // 2. yöntem
        Customer customer = new Customer("osman",
                                         "yaycıoğlu",
                                         200,
                                         100);

        Class<? extends Customer> aClass = customer.getClass();
        // 3. yöntem
        Class<MyClass> aClass1 = (Class<MyClass>) Class.forName("org.training.java.advanced.annotations.MyClass");

        // Reflection
        MyClass myClass = myClassClass.newInstance();
        Method myMethod = myClassClass.getMethod("myMethod");
        if (myMethod != null) {
            myMethod.invoke(myClass);
        }

        Method[] declaredMethods = myClassClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            MyAnno myAnno = method.getAnnotation(MyAnno.class);
            if (myAnno != null) {
                System.out.println(
                        method.getName() + " methodunda MyAnno bulundu. Info : " + myAnno.info() + " count : "
                                + myAnno.count() + " duration : " + myAnno.duration());
            }
            System.out.println(method.getName() + " - " + method.getReturnType().getName());
            Parameter[] parameters = method.getParameters();
        }

        Field[] declaredFields = myClassClass.getDeclaredFields();
        // myClassClass.getField("str");
        for (Field field:declaredFields) {
            System.out.println(field.getName() + " -  " + field.getType().getName() );
        }

    }
}
