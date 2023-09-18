package org.training.java.advanced.obj;

import org.training.java.advanced.intf.AbstractHello;
import org.training.java.advanced.intf.IHello;

public class ObjRun {
    public static void main(String[] args) {
        Mutable mutable = new Mutable();
        mutable.setName("osman");
        System.out.println(mutable);
        mutable.setSurname("yay");
        // ...

        Mutable mutable1 = Mutable.create()
                                  .setName("osman")
                                  .setSurname("yay")
                                  .setHeight(200)
                                  .setWeight(95)
                                  .setDesc("Eğitmen");

        Mutable mutable2 = new Mutable("osman",
                                       "yay",
                                       "Eğitmen",
                                       200,
                                       95);

        Immutable immutable = Immutable.getBuilder()
                                       .withName("osman")
                                       .withSurname("yaycıoğlu")
                                       .withDesc("Eğitmen")
                                       .withHeight(200)
                                       .withWeight(95)
                                       .build();

    }
}
