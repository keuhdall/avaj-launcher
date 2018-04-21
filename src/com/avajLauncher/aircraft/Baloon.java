package com.avajLauncher.aircraft;

import com.avajLauncher.weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        
    }
}
