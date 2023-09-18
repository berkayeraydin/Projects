package org.training.design.patterns.atm.with.patterns.behavioral.chain;

import org.training.design.patterns.atm.models.Customer;

public class CustomerRuleFactory {

    public static ICustomerRule getRuleChain(Customer customer){
        ICustomerRule customerRule = new CustomerNameRule(new CustomerSurnameRule(null));
        switch (customer.getCustomerType()){
            case GOLD:
                customerRule = new CustomerGoldRule(customerRule);
                break;
            case PLATINIUM:
                customerRule = new CustomerPlatiniumRule(customerRule);
                break;
            case COPPER:
                break;
        }
        return customerRule;
    }

}
