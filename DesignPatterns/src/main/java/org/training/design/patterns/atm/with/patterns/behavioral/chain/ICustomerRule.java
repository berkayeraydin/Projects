package org.training.design.patterns.atm.with.patterns.behavioral.chain;

import org.training.design.patterns.atm.models.Customer;

public interface ICustomerRule {
    void run(Customer customer);
}
