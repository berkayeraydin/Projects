package org.training.design.patterns.behavioral.observer;

public class AlarmRun {
    public static void main(String[] args) {
        AlarmSystem alarmSystem = new AlarmSystem();
        alarmSystem.init();
        try {
            alarmSystem.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
