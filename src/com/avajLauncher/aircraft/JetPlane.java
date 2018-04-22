package com.avajLauncher.aircraft;

import com.avajLauncher.weather.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower _weatherTower;
    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }


    @Override
    public void updateConditions() {
        String weather = _weatherTower.getWeather(_coordinates);
        switch (weather) {
            case "RAIN":
                _coordinates = new Coordinates(_coordinates.get_longitude(), _coordinates.get_latitude() + 5, _coordinates.get_height());
                System.out.println("JetPlane#" + _name + "(" + _id + "): " + "It's raining. Better watch out for lightnings");
                break;
            case "FOG":
                _coordinates = new Coordinates(_coordinates.get_longitude(), _coordinates.get_latitude() + 1, _coordinates.get_height());
                System.out.println("JetPlane#" + _name + "(" + _id + "): " + "The fog is killing me. Request permission to land.");
                break;
            case "SUN":
                _coordinates = new Coordinates(_coordinates.get_longitude(), _coordinates.get_latitude() + 10, _coordinates.get_height() + 2);
                System.out.println("JetPlane#" + _name + "(" + _id + "): " + "This is hot.");
                break;
            case "SNOW":
                _coordinates = new Coordinates(_coordinates.get_longitude(), _coordinates.get_latitude(), _coordinates.get_height() - 7);
                System.out.println("JetPlane#" + _name + "(" + _id + "): " + "OMG! Winter is coming!");
                break;
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        System.out.println("JetPlane#" + _name + "(" + _id + "): " + "registered to weather tower.");
        _weatherTower = weatherTower;
        _weatherTower.register(this);
    }
}
