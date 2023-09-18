package org.training.java.advanced.generics;

import java.time.LocalDate;

public class GenRun {
    public static void main(String[] args) {
        IntHolder intHolder = new IntHolder();
        intHolder.setValue(100);
        Integer value = intHolder.getValue();

        Holder holder = new Holder();
        holder.setValue("osman");
        holder.setValue(100);
        holder.setValue(423983489L);
        holder.setValue(123123.23D);
        Object value1 = holder.getValue();
        if (value1 instanceof String) {
            String str = (String) value1;
            System.out.println(str);
        }

        GenericHolder<String> gen1 = new GenericHolder<>();
        gen1.setValue("str1");
        String value2 = gen1.getValue();

        GenericHolder<Integer> gen2 = new GenericHolder<>();

        GenericTwoHolder<String,Double> g2h = new GenericTwoHolder<>();
        g2h.setValue("str2");
        g2h.setNextValue(100D);

        GenericTwoHolder<Long, LocalDate> g2h2 = new GenericTwoHolder<>();
        g2h2.setValue(100L);
        g2h2.setNextValue(LocalDate.now());

        GenericCharHolder<String> genericCharHolder = new GenericCharHolder<>();

    }
}
