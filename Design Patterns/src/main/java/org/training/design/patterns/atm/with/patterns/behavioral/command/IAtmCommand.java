package org.training.design.patterns.atm.with.patterns.behavioral.command;

import org.training.design.patterns.atm.models.Account;
import org.training.design.patterns.atm.models.Customer;
import org.training.design.patterns.atm.EAccountType;

import java.util.Scanner;

public interface IAtmCommand {
    void execute(Customer customer,
                 Scanner scanner);

    String commandString();

    default Account findAccount(Customer customer,
                                EAccountType accountType) {
        return customer.accountStream()
                       .filter(a -> a.getAccountType() == accountType)
                       .findFirst()
                       .orElse(null);
    }
}
