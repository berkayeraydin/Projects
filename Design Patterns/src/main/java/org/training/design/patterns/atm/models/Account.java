package org.training.design.patterns.atm.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.training.design.patterns.atm.EAccountType;

import java.math.BigDecimal;

@Getter
@Setter
@Builder(setterPrefix = "with")
@ToString
public class Account {
    private EAccountType accountType;
    private String       name;
    private BigDecimal amount;
    private String accountNumber;

}
