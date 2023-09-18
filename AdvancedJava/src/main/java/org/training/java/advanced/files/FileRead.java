package org.training.java.advanced.files;

import org.training.java.advanced.streams.Customer;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileRead {
    public static void main(String[] args) throws Exception {
//        File file = new File("myfile.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        byte[] readBytes = new byte[512];
//        int read = fileInputStream.read(readBytes);
//
//        FileChannel channel = fileInputStream.getChannel();
//        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
//        int read1 = channel.read(byteBuffer);
//        byteBuffer.limit(byteBuffer.position());
//        char aChar = byteBuffer.getChar();
//        if (aChar == '\n'){
//
//        }
//
//        Reader reader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String s = bufferedReader.readLine();


        Path filePath = Paths.get("myfile.txt");
        List<String> stringList = Files.readAllLines(filePath);
        System.out.println(stringList);

        Stream<Stream<Character>> streamStream = stringList.stream()
                                                           .distinct()
                                                           .map(l -> l.split(","))
                                                           .filter(a -> a.length == 4)
                                                           .map(a -> Arrays.stream(convertToCharArray(a[0])));
        stringList.stream()
                  .distinct()
                  .map(l -> l.split(","))
                  .filter(a -> a.length == 4)
                  .flatMap(a -> Arrays.stream(convertToCharArray(a[0])))
                  .distinct()
                  .sorted()
                  .forEach(System.out::println);

        List<Customer> customers = stringList.stream()
                                             .distinct()
                                             .map(l -> l.split(","))
                                             .filter(a -> a.length == 4)
                                             .map(parts -> new Customer(parts[0],
                                                                        parts[1],
                                                                        Integer.parseInt(parts[2]),
                                                                        Integer.parseInt(parts[3])))
                                             .filter(c -> c.getHeight() > 180)
                                             .filter(c -> c.getWeight() < 100)
                                             .sorted((c1, c2) -> c1.getName()
                                                                   .compareTo(c2.getName()))
                                             .collect(Collectors.toList());

        System.out.println(customers);

        Map<String, Customer> collect = stringList.stream()
                                                  .distinct()
                                                  .map(l -> l.split(","))
                                                  .filter(a -> a.length == 4)
                                                  .map(parts -> new Customer(parts[0],
                                                                             parts[1],
                                                                             Integer.parseInt(parts[2]),
                                                                             Integer.parseInt(parts[3])))
                                                  .filter(c -> c.getHeight() > 180)
                                                  .filter(c -> c.getWeight() < 100)
                                                  .sorted((c1, c2) -> c1.getName()
                                                                        .compareTo(c2.getName()))
                                                  .collect(Collectors.toMap(c -> c.getName() + "-" + c.getSurname(),
                                                                            c -> c));


        List<Customer> customerList = new ArrayList<>();
        for (String line : stringList) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                Customer customer = new Customer(parts[0],
                                                 parts[1],
                                                 Integer.parseInt(parts[2]),
                                                 Integer.parseInt(parts[3]));
                if (customer.getHeight() > 180 && customer.getWeight() < 100) {
                    customerList.add(customer);
                }
            }
        }
        Collections.sort(customerList,
                         (c1, c2) -> c1.getName()
                                       .compareTo(c2.getName()));
        // System.out.println(customerList);
    }

    public static Character[] convertToCharArray(String str) {
        char[] chars = new char[str.length()];
        str.getChars(0,
                     str.length(),
                     chars,
                     0);
        Character[] charsObject = new Character[str.length()];
        int index = 0;
        for (char c : chars) {
            charsObject[index++] = c;
        }
        return charsObject;
    }
}
