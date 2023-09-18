package org.training.design.patterns.creational.builder;

import java.time.LocalDate;
import java.util.List;

// Bu customer'ı immutable yapmak amacımız.
public class Customer {

    private final String name; // final best practice yapsakta olur yapmasakta olur.
    private final String surname;
    private final String username;
    private final String password;
    private final LocalDate birthDate;

    // private yaptığımız zaman otomatikmen bu objeyi kimse oluşturamaz.
    private Customer(String name, String surname, String username, String password, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
    }

    public static CustomerBuilder getBuilder(){
        return new CustomerBuilder();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public static class CustomerBuilder {
        private String name;
        private String surname;
        private String username;
        private String password;
        private LocalDate birthDate;

        private CustomerBuilder() {
        }

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public CustomerBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public CustomerBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public CustomerBuilder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        // Burası Customer'ın private constructor'ına erişebilir.
        public Customer build(){
            return new Customer(name,surname,username,password,birthDate);
        }
    }
}
