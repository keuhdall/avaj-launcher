package com.avajLauncher.aircraft;

import com.avajLauncher.weather.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }


    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
