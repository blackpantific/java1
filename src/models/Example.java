package models;

import contracts.ISequence;
import contracts.IntSequence;

public class Example implements ISequence, IntSequence {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int defaultNext() {
        //для однозначной реализации дефолтного метода
        return IntSequence.super.defaultNext();
    }

    @Override
    public int next() {
        return 0;
    }
}
