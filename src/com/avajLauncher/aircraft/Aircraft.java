package com.avajLauncher.aircraft;

import com.avajLauncher.weather.Coordinates;

public class Aircraft {
    protected long _id;
    protected final String _name;
    protected Coordinates _coordinates;
    private static long idCounter = 0;

    protected Aircraft(final String name, Coordinates coordinates) {
        _name = name;
        _coordinates = coordinates;
        _id = nextId();
    }

    private long nextId() {
        return idCounter++;
    }
}
