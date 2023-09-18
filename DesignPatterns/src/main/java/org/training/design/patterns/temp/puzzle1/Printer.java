package org.training.design.patterns.temp.puzzle1;

public class Printer {

    public void print(Employee employee){
        if (employee.getGender() == EGender.MALE) {
            System.out.println("Bay " + employee.getName() + " " + employee.getSurname());
        } else {
            System.out.println("Bayan " + employee.getName() + " " + employee.getSurname());
        }
    }

}
