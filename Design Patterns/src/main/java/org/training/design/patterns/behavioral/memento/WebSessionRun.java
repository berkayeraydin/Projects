package org.training.design.patterns.behavioral.memento;

import java.util.UUID;

public class WebSessionRun {

    public static void main(String[] args) {
        WebSession webSession = new WebSession(UUID.randomUUID()
                                                   .toString(),
                                               "session1");
//        CareTaker<WebSessionMemento> careTaker = new CareTaker<>(webSession);
//        webSession.doSomething();
//        careTaker.save();
//        // trans
//        webSession.doSomething();
//        careTaker.save();
//        webSession.doSomething();
//        System.out.println(webSession);
//        System.out.println("-------");
//        // rollback
//        careTaker.undo();
//        System.out.println(webSession);
//        System.out.println("-------");
        webSession.doSomething();
        System.out.println(webSession);
        webSession.backup();
        webSession.doSomething();
        System.out.println(webSession);
        System.out.println("---------");
        webSession.undo();
        System.out.println(webSession);
        System.out.println("---------");

        webSession.doSomething();
        System.out.println("Trans begin " + webSession);
        webSession.beginTrans();
        webSession.doSomething();
        webSession.doSomething();
        System.out.println(webSession);
        webSession.rollback();
        System.out.println("---------");
        System.out.println(webSession);



    }
}
