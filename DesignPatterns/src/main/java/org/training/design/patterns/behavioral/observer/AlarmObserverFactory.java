package org.training.design.patterns.behavioral.observer;

public class AlarmObserverFactory {

    public static  IAlarmObserver alarmObserver(){
        AlarmDistributor alarmDistributor = new AlarmDistributor();
        Door door1 = new Door("içkapı1",1);
        Door door2 = new Door("içkapı2",2);
        Door door3 = new Door("dışkapı1",3);
        Door door4 = new Door("dışkapı2",4);
        alarmDistributor.register(door1);
        alarmDistributor.register(door2);
        alarmDistributor.register(door3);
        alarmDistributor.register(door4);
        alarmDistributor.register(new Light("içışık1",5));
        alarmDistributor.register(new Light("içışık2",6));
        alarmDistributor.register(new Light("içışık3",7));
        alarmDistributor.register(new Light("dışışık3",8));
        alarmDistributor.register(new Gate("bahçekapısı",9));
        return alarmDistributor;

    }

}

