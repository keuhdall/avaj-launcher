package com.avajLauncher.aircraft;

public class Coordinates {
    private int _longitude;
    private int _latitude;
    private int _height;

    Coordinates(int longitude, int latitude, int height) {
        _longitude = longitude;
        _latitude = latitude;
        _height = height;
    }

    public int get_longitude() {
        return _longitude;
    }

    public int get_latitude() {
        return _latitude;
    }

    public int get_height() {
        return _height;
    }
}