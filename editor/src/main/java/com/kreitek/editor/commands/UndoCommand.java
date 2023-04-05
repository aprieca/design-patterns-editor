package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.snapshot.CareTaker;
import com.kreitek.editor.snapshot.Memento;
import com.kreitek.editor.snapshot.MementoFactory;

import java.util.ArrayList;

public class UndoCommand implements Command {
    Memento memento = MementoFactory.getMemento();
    CareTaker careTaker = CareTaker.getInstance();
    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.clear();
        memento = careTaker.get();
        careTaker.delete();
        documentLines.addAll(memento.getState());
    }
}
