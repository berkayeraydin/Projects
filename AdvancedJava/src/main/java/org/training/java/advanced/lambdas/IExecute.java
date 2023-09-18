package org.training.java.advanced.lambdas;

@FunctionalInterface
public interface IExecute {

    String execute(String runCmd);

    default void executeAndPrint(String runCmd){
        System.out.println(execute(runCmd));
    }

}
