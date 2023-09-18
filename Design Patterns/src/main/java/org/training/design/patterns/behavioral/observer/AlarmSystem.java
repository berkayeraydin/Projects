package org.training.design.patterns.behavioral.observer;

public class AlarmSystem {

    private IAlarmObserver alarmObserver;

    public void init(){
        alarmObserver = AlarmObserverFactory.alarmObserver();
    }
    public void run() throws Exception {
        Thread.sleep(2_000);
        alarmObserver.alarmOn(EAlarmType.FIRE);
        Thread.sleep(2_000);
        alarmObserver.alarmOff();

    }

}
