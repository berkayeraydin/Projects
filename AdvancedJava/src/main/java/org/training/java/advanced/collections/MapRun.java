package org.training.java.advanced.collections;

import org.training.java.advanced.streams.Customer;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapRun {
    public static void main(String[] args) {
        Map<String, Customer> customerMap2 = new TreeMap<>();
        // Thread Safe - Slow - Full Sync
        Map<String, Customer> customerMap3 = new Hashtable<>();
        // Thread Safe - Very Fast - Bucket Sync
        Map<String, Customer> customerMap4 = new ConcurrentHashMap<>(1_000_000,
                                                                     0.9f,
                                                                     1_000);

        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put("osman",
                        new Customer("osman",
                                     "yay",
                                     200,
                                     100));
        customerMap.put("osman2",
                        new Customer("osman2",
                                     "yay2",
                                     200,
                                     100));
        customerMap.put(null,
                        new Customer("osman2",
                                     "yay2",
                                     200,
                                     100));
        customerMap.putIfAbsent(null,
                                new Customer("osman3",
                                             "yay3",
                                             200,
                                             100));
        // System.out.println(customerMap);
        Customer customer = customerMap.get("osman");
        System.out.println(customer);

        Set<String> keySet = customerMap.keySet();
        for (String key : keySet) {
            if (key.contains("xyz")) {
                Customer customer1 = customerMap.get(key);
            }
        }

        Collection<Customer> values = customerMap.values();
        for (Customer c : values) {

        }

        Set<Map.Entry<String, Customer>> entries = customerMap.entrySet();
        for (Map.Entry<String, Customer> entry : entries) {
            entry.getKey();
            entry.getValue();
        }

    }
}
