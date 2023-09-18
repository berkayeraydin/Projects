package org.training.java.advanced.properties;

import org.training.java.advanced.reflection.Prop;
import org.training.java.advanced.reflection.PropFile;

@PropFile("my.properties")
public class ExtraProp {
    @Prop("extra.xyz")
    private String xyz;
    @Prop("extra.abc")
    private String abc;
    @Prop("extra.test")
    private String test;
    @Prop("extra.count")
    private int count;
    @Prop("extra.port")
    private int port;

    public String getXyz() {
        return xyz;
    }

    public void setXyz(String xyz) {
        this.xyz = xyz;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ExtraProp{" +
                "xyz='" + xyz + '\'' +
                ", abc='" + abc + '\'' +
                ", test='" + test + '\'' +
                ", count=" + count +
                ", port=" + port +
                '}';
    }
}
