package org.training.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AlarmDistributor implements IAlarmObserver {

    private List<IAlarmObserver> alarmObservers = new ArrayList<>();
    private Executor executor = Executors.newFixedThreadPool(5);

    public void register(IAlarmObserver alarmObserver){
        alarmObservers.add(alarmObserver);
    }


    @Override
    public void alarmOn(EAlarmType alarmType) {
        alarmObservers.forEach( a -> executor.execute(() -> a.alarmOn(alarmType)));
    }

    @Override
    public void alarmOff() {
        alarmObservers.forEach( a -> executor.execute(a::alarmOff));
    }
}
