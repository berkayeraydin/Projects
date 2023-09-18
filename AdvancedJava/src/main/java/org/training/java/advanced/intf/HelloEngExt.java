package org.training.java.advanced.intf;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

public class HelloEngExt extends HelloEng implements Closeable, Serializable, Comparable<HelloEngExt> {

    public String anotherAnotherHello(String name,
                                      String surname) {
        return "Another Another Hello " + name + " " + surname;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public int compareTo(HelloEngExt o) {
        return 0;
    }
}
