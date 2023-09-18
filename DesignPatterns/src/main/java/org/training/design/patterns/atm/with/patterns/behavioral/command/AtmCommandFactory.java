package org.training.design.patterns.atm.with.patterns.behavioral.command;

import org.training.design.patterns.atm.models.Account;
import org.training.design.patterns.atm.models.Customer;
import org.training.design.patterns.atm.EAccountType;

import java.util.ArrayList;
import java.util.List;

public class AtmCommandFactory {

    public static List<IAtmCommand> getCustomerAtmCommands(Customer customer) {
        List<IAtmCommand> atmCommands = new ArrayList<>();
        for (Account account :
                customer) {
            EAccountType accountType = account.getAccountType();
            switch (customer.getCustomerType()){
                case PLATINIUM:
                    atmCommands.add(new CreditAtmCommand(accountType));
                case GOLD:
                    atmCommands.add(new TransferAtmCommand(accountType));
                case COPPER:
                    atmCommands.add(new DepositAtmCommand(accountType));
                    atmCommands.add(new WithdrawAtmCommand(accountType));
                    atmCommands.add(new ShowAccountAtmCommand(accountType));
            }
        }
        return atmCommands;
    }
}
