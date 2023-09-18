package org.training.design.patterns.atm.with.patterns.behavioral.chain;

import org.training.design.patterns.atm.models.Customer;

public class CustomerSurnameRule extends AbstractCustomerRule {

    public CustomerSurnameRule(ICustomerRule next) {
        super(next);
    }

    @Override
    void internalRun(Customer customer) {
        if (customer.getSurname() == null){
            throw new IllegalArgumentException("Müşteri soy ismi null olamaz");
        }
        if (customer.getSurname().length() < 4) {
            throw new IllegalArgumentException("Müşteri soy ismi 4 karakterden küçük olamaz ");
        }

    }
}
