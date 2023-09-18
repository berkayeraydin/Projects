package org.training.design.patterns.behavioral.memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class WebSession extends AbstractSession<WebSessionMemento> {

    private String sessionId;
    private String name;

    private int    counter;
    private String data;
    private int    state;

    private String externalData;

    public WebSession(String sessionId,
                      String name) {
        this.sessionId = sessionId;
        this.name = name;
    }

    public void doSomething() {
        counter++;
        data = "data" + counter;
    }

    public WebSessionMemento save() {
        return WebSessionMemento.builder()
                                .withCounter(counter)
                                .withData(data)
                                .withExternalData(externalData)
                                .withState(state)
                                .build();
    }

    public void restore(WebSessionMemento webSessionMemento){
        counter = webSessionMemento.getCounter();
        data = webSessionMemento.getData();
        externalData = webSessionMemento.getExternalData();
        state = webSessionMemento.getState();
        // db işlemleri yap
    }


    public String getSessionId() {
        return sessionId;
    }

    public String getName() {
        return name;
    }

    public String getExternalData() {
        return externalData;
    }

    public void setExternalData(String externalData) {
        this.externalData = externalData;
    }
}
