package org.training.design.patterns.behavioral.observer;

public class Gate implements IAlarmObserver {

    private String name;
    private int index;
    private int doorState;

    public Gate(String name,
                int index) {
        this.name = name;
        this.index = index;
    }


    @Override
    public void alarmOn(EAlarmType alarmType) {
        if (alarmType == EAlarmType.BURGLARY){
            doorState = 0;
            System.out.println("Gate " + name + "-" + index + " closed.");
        } else {
            doorState = 2;
            System.out.println("Gate " + name + "-" + index + " opened.");
        }
    }

    @Override
    public void alarmOff() {
        System.out.println("Gate " + name + "-" + index + " opened.");
        doorState = 0;
    }
}
