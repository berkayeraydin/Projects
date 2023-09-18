package org.training.design.patterns.structural.adapter;

import org.training.design.patterns.temp.puzzle1.EGender;
import org.training.design.patterns.temp.puzzle1.Employee;
import org.training.design.patterns.temp.puzzle1.Person;

public class PersonToEmployeeAdapter extends Employee {
    private Person person;

    public PersonToEmployeeAdapter(Person person) {
        super(person.getFullName().substring(0,person.getFullName().indexOf(" ")),
              person.getFullName().substring(person.getFullName().indexOf(" ")+1),
              EGender.valueOf(person.getGender().toUpperCase()));
        this.person = person;
    }
}
