package org.training.design.patterns.temp.puzzle1;

import org.training.design.patterns.structural.adapter.PersonToEmployeeAdapter;
import org.training.design.patterns.structural.adapter.PrinterAdapter;
import org.training.design.patterns.structural.facade.IPrinterFacade;
import org.training.design.patterns.structural.facade.PrinterFacade;
import org.training.design.patterns.structural.facade.PrinterFacadeFactory;

// Springin en iyi yaptığı patterndir.
public class PrinterRun {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                                    .withName("osman")
                                    .withSurname("yaycıoğlu")
                                    .withGender(EGender.MALE)
                                    .build();
        PrinterAdapter printer = new PrinterAdapter();
        printer.print(employee);


        // Önemli
        IPrinterFacade printerFacade = PrinterFacadeFactory.printerFacade();
        printerFacade.print(employee);



        Person person = Person.builder()
                             .withFullName("osman yaycıoğlu")
                             .withGender("male")
                             .build(); // Bu satırı değiştir ve çalışır hale getir

        Employee employee1 = Employee.builder().withName(person.getFullName().substring(0,person.getFullName().indexOf(" ")))
                .withSurname(person.getFullName().substring(person.getFullName().indexOf(" ")+1))
                .withGender(EGender.valueOf(person.getGender().toUpperCase()))
                .build();

        printer.print(employee1);

        Employee personToEmployee = new PersonToEmployeeAdapter(Person.builder()
                .withFullName("osman yaycıoğlu")
                .withGender("male")
                .build()); // Bu satırı değiştir ve çalışır hale getir

        printer.print(personToEmployee);


    }
}
