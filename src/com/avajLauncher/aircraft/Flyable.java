package com.avajLauncher.aircraft;

import com.avajLauncher.weather.WeatherTower;

public interface Flyable {
    void updateConditions();
    void registerTower(WeatherTower weatherTower);
}
