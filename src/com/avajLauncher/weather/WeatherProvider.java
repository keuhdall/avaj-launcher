package com.avajLauncher.tower;

import com.avajLauncher.aircraft.Coordinates;

public class WeatherProvider {
    private WeatherProvider weatherProvider;
    private static final String[] weather = {"1", "2", "3"};

    private WeatherProvider() {
        weatherProvider = this;
    }

    public WeatherProvider getProvider() {
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates) {
        return weather[0];
    }
}
