package com.avajLauncher.aircraft;

import com.avajLauncher.weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower _weatherTower;
    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = _weatherTower.getWeather(_coordinates);
        switch (weather) {
            case "RAIN":
                _coordinates = new Coordinates(_coordinates.get_longitude(), _coordinates.get_latitude(), _coordinates.get_height() - 5);
                System.out.println("Baloon#" + _name + "(" + _id + "): " + "Damn you rain! You messed up my baloon");
                break;
            case "FOG":
                _coordinates = new Coordinates(_coordinates.get_longitude(), _coordinates.get_latitude(), _coordinates.get_height() - 3);
                System.out.println("Baloon#" + _name + "(" + _id + "): " + "There is so much fog, I can't see shit.");
                break;
            case "SUN":
                _coordinates = new Coordinates(_coordinates.get_longitude() + 2, _coordinates.get_latitude(), _coordinates.get_height() + 4);
                System.out.println("Baloon#" + _name + "(" + _id + "): " + "Let's enjoy the good weather and take some pics.");
                break;
            case "SNOW":
                _coordinates = new Coordinates(_coordinates.get_longitude(), _coordinates.get_latitude(), _coordinates.get_height() - 15);
                System.out.println("Baloon#" + _name + "(" + _id + "): " + "It's snowing. We're  gonna crash.");
                break;
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        System.out.println("Baloon#" + _name + "(" + _id + "): " + "registered to weather tower.");
        _weatherTower = weatherTower;
        _weatherTower.register(this);
    }
}
