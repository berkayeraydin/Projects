package org.training.java.advanced.obj;

public class Mutable {

    private String name;
    private String surname;
    private String desc;
    private int weight;
    private int height;


    public Mutable(){

    }

    public Mutable(String name,
                   String surname,
                   String desc,
                   int weight,
                   int height) {
        this.name = name;
        this.surname = surname;
        this.desc = desc;
        this.weight = weight;
        this.height = height;
    }

    public static Mutable create(){
        return new Mutable();
    }

    public String getName() {
        return name;
    }

    public Mutable setName(String name) {
        if (name == null){
            throw new IllegalArgumentException("name null olamaz");
        }
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Mutable setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Mutable setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Mutable setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Mutable setHeight(int height) {
        this.height = height;
        return this;
    }
}
