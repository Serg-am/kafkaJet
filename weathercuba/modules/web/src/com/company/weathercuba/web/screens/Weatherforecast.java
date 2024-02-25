package com.company.weathercuba.web.screens;

import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.gui.screen.*;

import com.company.weathercuba.core.service.WeatherService;
import com.haulmont.cuba.gui.UiComponents;

import javax.inject.Inject;

@UiController("weathercuba_Weatherforecast")
@UiDescriptor("weather-forecast.xml")
public class Weatherforecast extends Screen {

    @Inject
    private TextArea weatherTextArea;

    @Inject
    private WeatherService weatherService;
    @Inject
    private UiComponents uiComponents;


    public void onGetWeatherBtnClick() {
        String city = "Moscow"; // Получить название города из формы веб-интерфейса
        String weatherForecast = weatherService.getWeatherForecast(city);
        // Отобразить полученный прогноз погоды на веб-странице
        showWeatherForecast(weatherForecast);
    }

    // Метод для отображения данных о погоде на веб-странице
    public void showWeatherForecast(String forecastData) {
        TextArea weatherTextArea = uiComponents.create(TextArea.class);
        weatherTextArea.setValue(forecastData);
        getWindow().add(weatherTextArea);
    }
}
