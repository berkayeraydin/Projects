package org.training.design.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class GroupListener implements Iterable<IListener> {
    private List<IListener> listeners;

    public void add(IListener listener){
        if (listeners == null) {
            listeners = new ArrayList<>();
        }
        listeners.add(listener);
    }

    @Override
    public Iterator<IListener> iterator() {
        return listeners.iterator();
    }

    @Override
    public void forEach(Consumer<? super IListener> action) {
        listeners.forEach(action);
    }

    @Override
    public Spliterator<IListener> spliterator() {
        return listeners.spliterator();
    }
}
