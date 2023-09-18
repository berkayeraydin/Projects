package org.training.design.patterns.structural.facade;

import org.training.design.patterns.temp.puzzle1.Employee;
import org.training.design.patterns.temp.puzzle1.Person;

public interface IPrinterFacade {

    void print(Employee employee);

    void print(Person person);

}
