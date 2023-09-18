package org.training.design.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediator {
    private static Mediator               instance    = new Mediator();
    private        Map<String, IListener> listenerMap = new HashMap<>();
    private Map<String, GroupListener> grouplistenerMap = new HashMap<>();

    private Mediator() {
    }

    public static Mediator getInstance() {
        return instance;
    }

    public void register(String origin,
                         String group,
                         IListener iListener) {
        listenerMap.put(origin,
                        iListener);
        if (group != null){
            GroupListener iListeners = grouplistenerMap.get(group);
            if (iListeners == null){
                iListeners = new GroupListener();
                grouplistenerMap.put(group,iListeners);
            }
            iListeners.add(iListener);
        }
    }

    public void sendMessage(String endPoint,
                            Message message) {
        IListener iListener = listenerMap.get(endPoint);
        if (iListener != null) {
            iListener.handleMessage(message);
        }
    }

    public void sendGroupMessage(String group,
                            Message message) {
        GroupListener iListeners = grouplistenerMap.get(group);
        if (iListeners != null){
            iListeners.forEach(l -> l.handleMessage(message));
        }
    }

    public void sendMessage(Message message) {
        listenerMap.values()
                   .forEach(l -> l.handleMessage(message));
    }


}
