package com.avajLauncher.weather;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();
    private static final String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider() {
    }

    public static WeatherProvider getProvider() {
        return weatherProvider;
    }


    public String getCurrentWeather(Coordinates coordinates) {
        return weather[(coordinates.get_height() + coordinates.get_latitude() + coordinates.get_longitude()) % 4];
    }
}
