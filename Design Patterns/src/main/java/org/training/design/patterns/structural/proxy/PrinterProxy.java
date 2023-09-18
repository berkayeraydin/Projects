package org.training.design.patterns.structural.proxy;

import org.training.design.patterns.temp.puzzle1.Employee;
import org.training.design.patterns.temp.puzzle1.Printer;

import java.time.LocalDateTime;

public class PrinterProxy extends Printer {

    @Override
    public void print(Employee employee) {
        System.out.println(LocalDateTime.now()
                                   + " Starting to print : "
                                   + employee.getName()
                                   + " " + employee.getSurname());
        if (employee.getName().equalsIgnoreCase("ali")){
            throw new IllegalArgumentException("Ali print edilemez");
        }
        if (!employee.getName().startsWith("123")){
            super.print(employee);
        } else {
            System.out.println("Print işlemi yapılmadı");
        }
        System.out.println(LocalDateTime.now()
                                   + " Printing finished : "
                                   + employee.getName()
                                   + " " + employee.getSurname());
    }
}
