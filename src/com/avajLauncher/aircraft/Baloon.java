package com.avajLauncher.aircraft;

import com.avajLauncher.weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower _weatherTower;
    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        _weatherTower.getWeather(_coordinates);//TODO: print output
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        _weatherTower = weatherTower;
    }
}
