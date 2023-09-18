package org.training.design.patterns.structural.proxy;

import org.training.design.patterns.temp.puzzle1.EGender;
import org.training.design.patterns.temp.puzzle1.Employee;
import org.training.design.patterns.temp.puzzle1.Printer;

public class PrinterRun2 {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                                    .withName("osman")
                                    .withSurname("yaycıoğlu")
                                    .withGender(EGender.MALE)
                                    .build();
        Printer printer = new PrinterProxy(); // bu satırı değiştir
        printer.print(employee);
        try {
            employee.setName("ali");
            printer.print(employee);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        employee.setName("123osman");
        printer.print(employee);


    }
}
