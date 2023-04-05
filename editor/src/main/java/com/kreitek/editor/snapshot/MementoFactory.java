package com.kreitek.editor.snapshot;

public class MementoFactory {

   public static Memento getMemento() {
        Memento memento = new Memento();
        return memento;
    }
}
