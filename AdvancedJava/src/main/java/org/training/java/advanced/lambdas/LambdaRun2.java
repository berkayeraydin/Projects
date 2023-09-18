package org.training.java.advanced.lambdas;

public class LambdaRun2 {
    public static void main(String[] args) {
        IExecute execute1 = LambdaRun2::xyz;
        System.out.println(execute1.execute("cd .."));
        IExecute execute2 = String::valueOf;
        System.out.println(execute2.execute("cd .."));
        LambdaRun2 lambdaRun2 = new LambdaRun2();
        IExecute execute3 = lambdaRun2::abc;
        System.out.println(execute3.execute("cd .."));
    }

    public String abc(String runCmd) {
        return "Instance method : " + runCmd;
    }

    public static String xyz(String runCmd) {
        return "Static method : " + runCmd;
    }
}
