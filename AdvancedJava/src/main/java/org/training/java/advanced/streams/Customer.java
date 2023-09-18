package org.training.java.advanced.streams;

import java.util.Objects;

public class Customer {

    private String name;
    private String surname;
    private Integer height;
    private Integer weight;

    public Customer() {
    }

    public Customer(String name,
                    String surname,
                    Integer height,
                    Integer weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name,
                              customer.name) && Objects.equals(surname,
                                                               customer.surname)
                && Objects.equals(height,
                                  customer.height) && Objects.equals(weight,
                                                                     customer.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
                            surname,
                            height,
                            weight);
    }
}
