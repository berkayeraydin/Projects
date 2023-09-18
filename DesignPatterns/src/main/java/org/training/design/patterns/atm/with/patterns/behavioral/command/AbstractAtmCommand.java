package org.training.design.patterns.atm.with.patterns.behavioral.command;

import org.training.design.patterns.atm.EAccountType;

public abstract class AbstractAtmCommand implements IAtmCommand {
    protected EAccountType accountType;

    public AbstractAtmCommand(EAccountType accountType) {
        this.accountType = accountType;
    }
}
