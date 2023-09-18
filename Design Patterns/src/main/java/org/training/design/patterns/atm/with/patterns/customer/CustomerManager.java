package org.training.design.patterns.atm.with.patterns.customer;

import org.training.design.patterns.atm.models.Account;
import org.training.design.patterns.atm.models.Customer;
import org.training.design.patterns.atm.EAccountType;
import org.training.design.patterns.atm.ECustomerType;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomerManager {
    private Map<String, Customer> customerMap = new ConcurrentHashMap<>();

    public void init() {
        Customer customer = Customer.builder()
                                    .withName("osman")
                                    .withSurname("yay")
                                    .withUsername("osmany")
                                    .withPassword("123456")
                                    .withCustomerType(ECustomerType.COPPER)
                                    .withAccounts(Arrays.asList(Account.builder()
                                                                       .withAccountType(EAccountType.TL)
                                                                       .withName("osmantl")
                                                                       .withAmount(BigDecimal.valueOf(1000L))
                                                                       .build()))
                                    .build();
        customerMap.put(customer.getUsername(),
                        customer);
        customer = Customer.builder()
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
        customerMap.put(customer.getUsername(),
                        customer);
    }

    public Customer getCustomer(String username) {
        return customerMap.get(username);
    }
}
