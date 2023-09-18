package org.training.design.patterns.atm.with.patterns.behavioral.command;

import org.training.design.patterns.atm.models.Account;
import org.training.design.patterns.atm.models.Customer;
import org.training.design.patterns.atm.EAccountType;

import java.math.BigDecimal;
import java.util.Scanner;

public class WithdrawAtmCommand extends AbstractAtmCommand {

    public WithdrawAtmCommand(EAccountType accountType) {
        super(accountType);
    }

    @Override
    public void execute(Customer customer,
                        Scanner scanner) {
        Account account = findAccount(customer,
                                      accountType);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            System.out.println("Çekeceğiniz miktar : ");
            BigDecimal wamount = scanner.nextBigDecimal();
            account.setAmount(amount.subtract(wamount));
            System.out.println(accountType + " yatırma İşleminiz gerçekleştirildi");
        } else {
            System.out.println(accountType + " accountunuz yok");
        }
    }

    @Override
    public String commandString() {
        return accountType + " para çek";
    }
}
