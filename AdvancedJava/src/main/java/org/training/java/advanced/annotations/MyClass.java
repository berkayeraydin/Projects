package org.training.java.advanced.annotations;

public class MyClass {

    @MyAnno(info = "osman", count = 10, duration = 80_000)
    private String str;
    private Integer port;

    @MyAnno(info = "osman", count = 10)
    @MyDesc("test")
    public void myMethod() {
        System.out.println("dhf");
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getPort() {
        return port;
    }

    @MyAnno(info = "ali", count = 50,duration = 20)
    public void setPort(Integer port) {
        this.port = port;
    }
}
