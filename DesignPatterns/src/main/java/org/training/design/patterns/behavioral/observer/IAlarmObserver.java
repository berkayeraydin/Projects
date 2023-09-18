package org.training.design.patterns.behavioral.observer;

public interface IAlarmObserver {

    void alarmOn(EAlarmType alarmType);

    void alarmOff();

}
