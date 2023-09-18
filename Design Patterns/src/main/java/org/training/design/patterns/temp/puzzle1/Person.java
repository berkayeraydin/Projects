package org.training.design.patterns.temp.puzzle1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(setterPrefix = "with")
public class Person {
    private String fullName;
    private String gender;
}
