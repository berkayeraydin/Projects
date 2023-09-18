package org.training.design.patterns.temp.creational;

import lombok.Setter;

import java.time.LocalDate;

// Encapsulation -> Dışardan değişmesine maksimum derecede kapalı olmasıdır.
// immutable obje dir.
@Setter
public class CustomerImmutable1 {

    // Burada ki datalar yaratıldıktan sonra değiştirilmemesi gerekiyor.
    // immutable objectdir. Çünkü yaratıldıktan sonra bir daha değiştirilmez.
    // String immutabledir.
    private String name;
    private String surname;
    private String username;
    private String password;
    private LocalDate birthDate;

    public CustomerImmutable1(String name, String surname, String username, String password, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
    }

    public CustomerImmutable1(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }
}
