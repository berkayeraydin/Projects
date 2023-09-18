package org.training.java.advanced.lambdas;

public class Executor implements IExecute{

    private String prefix;

    public Executor(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String execute(String runCmd) {
        return this.prefix + " executing " + runCmd;
    }
}
