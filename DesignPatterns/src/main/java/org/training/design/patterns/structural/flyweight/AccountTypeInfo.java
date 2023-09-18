package org.training.design.patterns.structural.flyweight;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountTypeInfo {
    private int type;
    private String description;   // 200
    private String shortDescription; // 50
    private String endPoint; // 50


}
