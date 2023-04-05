package com.kreitek.editor.snapshot;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private static volatile CareTaker instance;

    private CareTaker() {
    }

    public static CareTaker getInstance() {
        if (instance == null) {
            instance = new CareTaker();
        }
        return instance;
    }

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public void delete() {
        int index = mementoList.size() - 1;
        mementoList.remove(index);
    }

    public Memento get() {
        try {
            int index = mementoList.size() - 2;
            Memento memento = mementoList.get(index);
            return memento;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("No more changes to undo, you need to add new elements");
        }
        Memento memento = MementoFactory.getMemento();
        return memento;
    }

    @Override
    public String toString() {
        return "CareTaker{" +
                "mementoList=" + mementoList +
                '}';
    }
}

