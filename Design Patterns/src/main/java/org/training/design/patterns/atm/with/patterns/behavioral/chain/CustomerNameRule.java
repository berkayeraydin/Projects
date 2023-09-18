package org.training.design.patterns.atm.with.patterns.behavioral.chain;

import org.training.design.patterns.atm.EAccountType;
import org.training.design.patterns.atm.models.Customer;

public class CustomerNameRule extends AbstractCustomerRule {

    public CustomerNameRule(ICustomerRule next) {
        super(next);
    }

    @Override
    void internalRun(Customer customer) {
        if (customer.getName() == null){
            throw new IllegalArgumentException("Müşteri ismi null olamaz");
        }
        if (customer.getName().startsWith("123")) {
            throw new IllegalArgumentException("Müşteri ismi 123 ile başlayamaz");
        }

    }
}
