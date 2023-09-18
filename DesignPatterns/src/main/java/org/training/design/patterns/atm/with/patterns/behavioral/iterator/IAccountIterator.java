package org.training.design.patterns.atm.with.patterns.behavioral.iterator;

import org.training.design.patterns.atm.models.Account;
import org.training.design.patterns.atm.models.Customer;

public interface IAccountIterator {
    boolean hasNext();
    Account next();
}
