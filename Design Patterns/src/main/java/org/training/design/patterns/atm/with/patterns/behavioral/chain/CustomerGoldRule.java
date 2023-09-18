package org.training.design.patterns.atm.with.patterns.behavioral.chain;

import org.training.design.patterns.atm.EAccountType;
import org.training.design.patterns.atm.ECustomerType;
import org.training.design.patterns.atm.models.Customer;

public class CustomerGoldRule extends AbstractCustomerRule {

    public CustomerGoldRule(ICustomerRule next) {
        super(next);
    }

    @Override
    void internalRun(Customer customer) {
        if (customer.accountStream()
                    .noneMatch(a -> a.getAccountType() == EAccountType.TL)) {
            throw new IllegalArgumentException("TL hesabı yok");
        }
        if (customer.accountStream()
                    .noneMatch(a -> a.getAccountType() == EAccountType.DOLAR)) {
            throw new IllegalArgumentException("DOLAR hesabı yok");
        }
    }
}
