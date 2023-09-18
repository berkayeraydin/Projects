package org.training.design.patterns.behavioral.memento;

import lombok.Builder;
import lombok.Getter;

@Builder(setterPrefix = "with")
@Getter
public class WebSessionMemento {

    private int counter;
    private String data;
    private int state;
    private String externalData;


}
