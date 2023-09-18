package org.training.design.patterns.behavioral.mediator;

public class MediatorRun {
    public static void main(String[] args) {
        ListenerModule1 listenerModule1 = new ListenerModule1();
        ListenerModule2 listenerModule2 = new ListenerModule2();
        ListenerModule3 listenerModule3 = new ListenerModule3();
        Mediator.getInstance()
                .sendMessage(Message.builder()
                                    .withOrigin("system")
                                    .withText("deneme1")
                                    .withCode(100)
                                    .build());
        System.out.println("-----------");
        Mediator.getInstance()
                .sendMessage("module1",Message.builder()
                                    .withOrigin("system")
                                    .withText("deneme2")
                                    .withCode(101)
                                    .build());

        System.out.println("-----------");
        Mediator.getInstance()
                .sendGroupMessage("gr1",Message.builder()
                                              .withOrigin("system")
                                              .withText("deneme3")
                                              .withCode(101)
                                              .build());

    }

}
