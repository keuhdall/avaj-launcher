package com.avajLauncher.aircraft;

import com.avajLauncher.weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower _weatherTower;
    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = _weatherTower.getWeather(_coordinates);
        switch (weather) {
            case "RAIN":
                _coordinates = new Coordinates(_coordinates.get_longitude() + 5, _coordinates.get_latitude(), _coordinates.get_height());
                System.out.println("Helicopter#" + _name + "(" + _id + "): " + "It's raining.");
                break;
            case "FOG":
                _coordinates = new Coordinates(_coordinates.get_longitude() + 1, _coordinates.get_latitude(), _coordinates.get_height());
                System.out.println("Helicopter#" + _name + "(" + _id + "): " + "I can't see shit.");
                break;
            case "SUN":
                _coordinates = new Coordinates(_coordinates.get_longitude() + 10, _coordinates.get_latitude(), _coordinates.get_height() + 2);
                System.out.println("Helicopter#" + _name + "(" + _id + "): " + "This is hot.");
                break;
            case "SNOW":
                _coordinates = new Coordinates(_coordinates.get_longitude(), _coordinates.get_latitude(), _coordinates.get_height() - 12);
                System.out.println("Helicopter#" + _name + "(" + _id + "): " + "My rotor is going to freeze!");
                break;
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        System.out.println("Helicopter#" + _name + "(" + _id + "): " + "registered to weather tower.");
        _weatherTower = weatherTower;
        _weatherTower.register(this);
    }
}
