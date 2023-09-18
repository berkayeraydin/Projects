package org.training.design.patterns.atm.with.patterns.customer;

import org.training.design.patterns.atm.models.Customer;

public class CustomerFacade {
    private final CustomerManager          customerManager;
    private final CustomerSystemValidation customerSystemValidation;

    public CustomerFacade() {
        customerManager = new CustomerManager();
        customerManager.init();
        customerSystemValidation = new CustomerSystemValidation();
    }

    public Customer login(String username,
                          String password) {
        Customer customer = customerManager.getCustomer(username);
        if (customer != null) {
            if (customer.getPassword()
                        .equals(password) && customerSystemValidation.checkCustomer(customer)) {
                return customer;
            }
        }
        return null;
    }
}
