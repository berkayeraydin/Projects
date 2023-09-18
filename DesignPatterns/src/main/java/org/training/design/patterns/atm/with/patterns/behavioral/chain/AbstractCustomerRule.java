package org.training.design.patterns.atm.with.patterns.behavioral.chain;

import org.training.design.patterns.atm.models.Customer;

public abstract class AbstractCustomerRule implements ICustomerRule {
    private ICustomerRule next;

    public AbstractCustomerRule(ICustomerRule next) {
        this.next = next;
    }

    @Override
    public void run(Customer customer) {
        internalRun(customer);
        if (next != null){
            next.run(customer);
        }
    }

    abstract void internalRun(Customer customer);


}
