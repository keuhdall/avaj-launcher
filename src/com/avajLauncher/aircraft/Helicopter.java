package com.avajLauncher.aircraft;

import com.avajLauncher.weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {
    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
