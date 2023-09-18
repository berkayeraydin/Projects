package org.training.design.patterns.structural.flyweight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountFly {

    private String          name;
    private double          amount;
    private AccountTypeInfo accountTypeInfo; // 4 byte

//    private int type;
//    private String description;   // 200
//    private String shortDescription; // 50
//    private String endPoint; // 50

    public AccountFly() {
    }


}
