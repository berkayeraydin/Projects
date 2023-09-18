package org.training.design.patterns.structural.facade;

public class PrinterFacadeFactory {

    public static IPrinterFacade printerFacade(){
        String property = System.getProperty("app.printer.type");
        if (property == null){
            return new PrinterFacade();
        }
        if ("new.printer".equals(property)){
            return new PrinterNewFacade();
        }
        return new PrinterFacade();
    }

}
