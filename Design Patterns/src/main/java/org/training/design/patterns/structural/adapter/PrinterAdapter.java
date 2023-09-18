package org.training.design.patterns.structural.adapter;

import org.training.design.patterns.temp.puzzle1.EGender;
import org.training.design.patterns.temp.puzzle1.Employee;
import org.training.design.patterns.temp.puzzle1.Person;
import org.training.design.patterns.temp.puzzle1.Printer;

public class PrinterAdapter extends Printer {


    public void print(Person person){
        Employee employee1 = Employee.builder()
                                     .withName(person.getFullName()
                                                     .substring(0,
                                                                person.getFullName()
                                                                      .indexOf(" ")))
                                     .withSurname(person.getFullName()
                                                        .substring(person.getFullName()
                                                                         .indexOf(" ") + 1))
                                     .withGender(EGender.valueOf(person.getGender()
                                                                       .toUpperCase()))
                                     .build();
        super.print(employee1);
    }

}
