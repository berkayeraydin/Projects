package org.training.design.patterns.creational.factory;

import java.util.Arrays;
import java.util.List;

public class HelloFactory {

    private static List<IHello> hellos = Arrays.asList(new HelloEng(),
            new HelloTr(),
            new HelloCh());

    public static IHello createHello(int index) {
        if (index > hellos.size()) {
            return null;
        }
        return hellos.get(index - 1);
    }

    public static void showMenu() {
        int index = 1;
        for (IHello hello : hellos) {
            System.out.println(index + "-" + hello.desc());
            index++;
        }
    }

}
