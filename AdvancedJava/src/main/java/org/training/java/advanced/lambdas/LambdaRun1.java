package org.training.java.advanced.lambdas;

public class LambdaRun1 {
    public static void main(String[] args) {
        String prefix = "başlangıç";
        IExecute execute1 = new Executor(prefix);
        System.out.println(execute1.execute("cd .."));
        executeExecutor(execute1);

        IExecute execute2 = new IExecute() {
            @Override
            public String execute(String runCmd) {
                return prefix + " çalıştırıyorum : " + runCmd;
            }
        };

        executeExecutor(execute2);

        IExecute execute3 = e -> prefix + " lambda execution " + e;
        execute3.executeAndPrint("test");
        String test = execute3.execute("test");
        System.out.println(test);
        executeExecutor(e  -> prefix + " lambda execution " + e);
        executeExecutor(e -> " lambda execution " + e);
        executeExecutor(e -> prefix + " xyz  " + e);

        IProcess process1 = (ali,veli) -> "processing " + ali + " count : " + veli;
        IProcess process2 = (w,y) -> {
            System.out.println("test1");
            System.out.println("test2");
            return "processing " + w + " count : " + y;
        };

        IFill fill1 = () -> "Filling blanks!";
    }

    public static void executeExecutor(IExecute execute) {
        System.out.println("Execution : fill " + execute.execute("fill"));
    }

}
