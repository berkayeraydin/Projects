package org.training.design.patterns.temp.creational;

import lombok.Setter;

import java.time.LocalDate;

// Burada da Builder Pattern de uyguladığımız şeyi uygulayabiliriz.
// Mutable obje dir.
@Setter
public class CustomerMutable {

    private String name;
    private String surname;
    private String username;
    private String password;
    private LocalDate birthDate;

    public static CustomerMutable createCustomer(){
        return new CustomerMutable();
    }

    public String getName() {
        return name;
    }

    public CustomerMutable setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public CustomerMutable setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public CustomerMutable setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CustomerMutable setPassword(String password) {
        this.password = password;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public CustomerMutable setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }
}
