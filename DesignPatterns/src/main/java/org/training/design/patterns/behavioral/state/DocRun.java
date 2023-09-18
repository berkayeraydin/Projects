package org.training.design.patterns.behavioral.state;

public class DocRun {

    public static void main(String[] args) {
        Document documentState = new Document();
        documentState.add("osman");
        documentState.add(" yaycıoğlu");
        documentState.close();
        documentState.add("osman");
        System.out.println("Current state : " + documentState.docState());
        documentState.lock();
        documentState.add("osman");
        System.out.println("Current state : " + documentState.docState());
        documentState.unlock();
        documentState.add("osman");
        System.out.println("Current state : " + documentState.docState());
        documentState.open();
        documentState.add(" deneme");
        System.out.println("Current state : " + documentState.docState());
        System.out.println("**** Current text : " + documentState.getText());
        documentState.close();



    }

}
