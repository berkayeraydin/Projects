package org.training.java.advanced.obj;

public class Immutable {

    private final String name;
    private final String surname;
    private final String desc;
    private final int weight;
    private final int height;

    private Immutable(String name,
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDesc() {
        return desc;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public static ImmutableBuilder getBuilder(){
        return new ImmutableBuilder();
    }

    public static class ImmutableBuilder {
        private  String name;
        private  String surname;
        private  String desc;
        private  int weight;
        private  int height;

        private ImmutableBuilder(){
        }

        public String getName() {
            return name;
        }

        public ImmutableBuilder withName(String name) {
            if (name == null){
                throw new IllegalArgumentException("name null olamaz");
            }
            this.name = name;
            return this;
        }

        public String getSurname() {
            return surname;
        }

        public ImmutableBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public String getDesc() {
            return desc;
        }

        public ImmutableBuilder withDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public int getWeight() {
            return weight;
        }

        public ImmutableBuilder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public int getHeight() {
            return height;
        }

        public ImmutableBuilder withHeight(int height) {
            this.height = height;
            return this;
        }

        public Immutable build(){
            return new Immutable(name,surname,desc,weight,height);
        }
    }
}
