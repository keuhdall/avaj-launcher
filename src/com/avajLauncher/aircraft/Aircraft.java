package com.lmarques.aircraft;

public class Aircraft {
    protected long _id;
    protected final String _name;
    protected Coordinates _coordinates;
    private static long idCounter = 0;

    protected Aircraft(final String name, Coordinates coordinates) {
        _name = name;
        _coordinates = coordinates;
        idCounter++;
    }

    private long nextId() {
        return 0;
    }
}
