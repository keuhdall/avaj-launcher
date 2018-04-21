package com.avajLauncher.aircraft;

import com.avajLauncher.weather.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower _weatherTower;
    JetPlane(String name, Coordinates coordinates) {
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
