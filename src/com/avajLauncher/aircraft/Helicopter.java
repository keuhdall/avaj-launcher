package com.avajLauncher.aircraft;

import com.avajLauncher.weather.Simulator;
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
                Simulator.writer.println("Helicopter#" + _name + "(" + _id + "): " + "It's raining.");
                break;
            case "FOG":
                _coordinates = new Coordinates(_coordinates.get_longitude() + 1, _coordinates.get_latitude(), _coordinates.get_height());
                Simulator.writer.println("Helicopter#" + _name + "(" + _id + "): " + "I can't see shit.");
                break;
            case "SUN":
                _coordinates = new Coordinates(_coordinates.get_longitude() + 10, _coordinates.get_latitude(), _coordinates.get_height() + 2);
                Simulator.writer.println("Helicopter#" + _name + "(" + _id + "): " + "This is hot.");
                break;
            case "SNOW":
                _coordinates = new Coordinates(_coordinates.get_longitude(), _coordinates.get_latitude(), _coordinates.get_height() - 12);
                Simulator.writer.println("Helicopter#" + _name + "(" + _id + "): " + "My rotor is going to freeze!");
                break;
        }
        if (_coordinates.get_height() == 0) {
            _weatherTower.unregister(this);
            Simulator.writer.println("Helicopter#" + _name + "(" + _id + "): landing.");
            Simulator.writer.println("Tower says: Helicopter#" + _name + "(" + _id + ")" + " unregistered from weather tower.");
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        Simulator.writer.println("Helicopter#" + _name + "(" + _id + "): " + "registered to weather tower.");
        _weatherTower = weatherTower;
        _weatherTower.register(this);
    }
}
