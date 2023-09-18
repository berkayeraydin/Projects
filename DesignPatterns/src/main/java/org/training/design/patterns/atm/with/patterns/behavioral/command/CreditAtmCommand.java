package org.training.design.patterns.atm.with.patterns.behavioral.command;

import org.training.design.patterns.atm.models.Account;
import org.training.design.patterns.atm.models.Customer;
import org.training.design.patterns.atm.EAccountType;

import java.math.BigDecimal;
import java.util.Scanner;

public class CreditAtmCommand extends AbstractAtmCommand {

    public CreditAtmCommand(EAccountType accountType) {
        super(accountType);
    }

    @Override
    public void execute(Customer customer,
                        Scanner scanner) {
        Account account = findAccount(customer,
                                      accountType);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            System.out.println("Kredi miktarı : ");
            BigDecimal creditAmount = scanner.nextBigDecimal();
            account.setAmount(amount.add(creditAmount));
            System.out.println(account);
        } else {
            System.out.println(accountType + " accountunuz yok");
        }

    }


    @Override
    public String commandString() {
        return accountType + " kredi çekme";
    }
}
