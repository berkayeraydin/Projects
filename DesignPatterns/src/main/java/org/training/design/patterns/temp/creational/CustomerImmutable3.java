package org.training.design.patterns.temp.creational;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

// creational.builder kısmında ki olayı lombok ile yapmak çok kolay.

@Builder(setterPrefix = "with")
@Getter
public class CustomerImmutable3 {

    private String name;
    private String surname;
    private String username;
    private String password;
    private LocalDate birthDate;

}
