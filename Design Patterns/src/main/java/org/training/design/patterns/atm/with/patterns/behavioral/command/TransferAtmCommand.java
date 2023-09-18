package org.training.design.patterns.atm.with.patterns.behavioral.command;

import org.training.design.patterns.atm.models.Account;
import org.training.design.patterns.atm.models.Customer;
import org.training.design.patterns.atm.EAccountType;

import java.math.BigDecimal;
import java.util.Scanner;

public class TransferAtmCommand extends AbstractAtmCommand {

    public TransferAtmCommand(EAccountType accountType) {
        super(accountType);
    }

    @Override
    public void execute(Customer customer,
                        Scanner scanner) {
        Account account = findAccount(customer,
                                      accountType);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            System.out.println("Gönderilecek hesap no : ");
            String accountNumber = scanner.next();
            System.out.println("Göndereceğiniz miktar : ");
            BigDecimal transferAmount = scanner.nextBigDecimal();
            account.setAmount(amount.subtract(transferAmount));
            System.out.println(accountType + " transfer İşleminiz gerçekleştirildi");
        } else {
            System.out.println(accountType + " accountunuz yok");
        }
    }

    @Override
    public String commandString() {
        return accountType + " para transfer";
    }
}
