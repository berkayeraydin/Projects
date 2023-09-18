package org.training.java.advanced.collections;


import org.training.java.advanced.composition.usage.*;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListRun {
    public static void main(String[] args) {
        List<String> strList2 = new CopyOnWriteArrayList<>();
        List<String> strList1 = Collections.synchronizedList(new ArrayList<>());

        // Fast
        strList1.addAll(null);
        // Very Slow
        strList1.containsAll(null);
        strList1.contains(null);
        // Very very slow
        strList1.retainAll(null);
        strList1.removeAll(null);
        List<String> strList = new ArrayList<>(1_200_000);

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
        }

        System.gc();

        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
        }

        long d = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            strList.add("test" + i);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - d));

         d = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            strList.get(i);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - d));
        String s1;
        d = System.currentTimeMillis();
        for (String s:strList) {
            s1 = s;
        }
        System.out.println("Iterator Delta : " + (System.currentTimeMillis() - d));

        d = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            strList.remove(0);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - d));


        List<String> stringList = new ArrayList<>();
        stringList.add("osman");
        stringList.add("ali");

        String s = stringList.get(1);
        int size = stringList.size();
        stringList.add("veli");
        stringList.add("veli");
        stringList.add("veli");
        stringList.add("osman");
        stringList.remove(1);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println("---------------");
        for (String str : stringList) {
            System.out.println(str);
        }
        System.out.println("---------------");
        stringList.forEach(rt -> System.out.println(rt));

        List<Car> carList = new ArrayList<>();
        carList.add(new Car(new CarType(ECarType.DIZEL,
                                        120),
                            new TransType(ETransType.MANUEL,
                                          180)));
        Car car = carList.get(0);

        List<Object> objectList = new ArrayList<>();
        List objectList2 = new ArrayList<>();
        objectList2.add("osman");
        objectList2.add(100);

    }
}
