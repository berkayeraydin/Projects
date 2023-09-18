package org.training.design.patterns.temp.puzzle1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(setterPrefix = "with")
public class Employee {

    private String name;
    private String surname;
    private EGender gender;

    public Employee(String substring, String substring1, EGender gender) {
    }
}