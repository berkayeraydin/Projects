package org.training.design.patterns.atm.with.patterns.behavioral.iterator;

import org.training.design.patterns.atm.EAccountType;
import org.training.design.patterns.atm.ECustomerType;
import org.training.design.patterns.atm.models.Account;
import org.training.design.patterns.atm.models.Customer;
import org.training.design.patterns.atm.with.patterns.behavioral.iterator.IAccountIterator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CustomerRun {
    public static void main(String[] args) {
        Customer customer = Customer.builder()
                                    .withName("ali")
                                    .withSurname("yaycıoğlu")
                                    .withUsername("aliyay")
                                    .withPassword("123456")
                                    .withCustomerType(ECustomerType.PLATINIUM)
                                    .withAccounts(Arrays.asList(Account.builder()
                                                                       .withAccountType(EAccountType.TL)
                                                                       .withName("alitl")
                                                                       .withAmount(BigDecimal.valueOf(1000L))
                                                                       .build(),
                                                                Account.builder()
                                                                       .withAccountType(EAccountType.DOLAR)
                                                                       .withName("aliUSD")
                                                                       .withAmount(BigDecimal.valueOf(3000L))
                                                                       .build(),
                                                                Account.builder()
                                                                       .withAccountType(EAccountType.EURO)
                                                                       .withName("aliEURO")
                                                                       .withAmount(BigDecimal.valueOf(5000L))
                                                                       .build()))
                                    .build();
//        List<Account> accounts = customer.getAccounts();
//        for (Account ac:
//             accounts) {
//            System.out.println(ac);
//        }
//
//        Iterator<Account> iterator = accounts.iterator();
//        while (iterator.hasNext()){
//            Account next = iterator.next();
//            System.out.println(next);
//        }
        IAccountIterator customIterator = customer.getCustomIterator();
        while (customIterator.hasNext()){
            Account next = customIterator.next();
            System.out.println(next);
        }

        Iterator<Account> accountIterator = customer.getAccountIterator();
        while (accountIterator.hasNext()){
            Account next = accountIterator.next();
            System.out.println(next);
        }

        for (Account account:
             customer) {
            System.out.println(account);
        }

        customer.forAccountEach(System.out::println);

    }
}
