package com.kreitek.editor.snapshot;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    private List<String> state = new ArrayList<>();

    public Memento() {
    }

    public List<String> getState() {
        return this.state;
    }

    public void setState(List<String> state) {
        this.state.addAll(state);
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state=" + state +
                '}';
    }
}
