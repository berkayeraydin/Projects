package org.training.design.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Account {

    @Setter
    private String name;
    @Setter
    private double amount;
    private int type;
    private String description;
    private String shortDescription;
    private String endPoint;

    public Account(){

    }

    public Account(String name, double amount, int type, String description, String shortDescription, String endPoint) {
        this.name = name;
        this.amount = amount;
        this.type = type;
        this.description = description;
        this.shortDescription = shortDescription;
        this.endPoint = endPoint;
    }

    // Kenti tipindeki objeyi kendisi yaratıyor. Böylece DB ye gitmeme gerek kalmadı.
    // Yaratılması uzun süren objeyi bu şekilde kopyalıyoruz.
    public Account cloneMe() {
        Account account = new Account();
        account.description = description;
        account.shortDescription = shortDescription;
        account.endPoint = endPoint;
        account.type = type;
        return account;
    }
}
