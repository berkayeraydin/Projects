package org.training.design.patterns.behavioral.mediator;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder(setterPrefix = "with")
public class Message {
    private String origin;
    private String text;
    private int code;
}
