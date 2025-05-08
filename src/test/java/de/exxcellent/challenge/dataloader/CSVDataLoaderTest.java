package de.exxcellent.challenge.dataloader;

import de.exxcellent.challenge.model.WeatherData;
import de.exxcellent.challenge.parser.CSVWeatherParser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class CSVDataLoaderTest {

    @Test
    public void testCSVLoaderWithWeatherData() {
        List<WeatherData> expectedDataList = new ArrayList<>();
        expectedDataList.add(new WeatherData(1, 59,88));
        expectedDataList.add(new WeatherData(2,63,79));
        expectedDataList.add(new WeatherData(3, 55,77));

        CSVDataLoader<WeatherData> csvWeatherDataLoader = new CSVDataLoader<>(new CSVWeatherParser());
        List<WeatherData> weatherDataList = csvWeatherDataLoader.load("de/exxcellent/challenge/weather_test.csv");

        assertEquals(weatherDataList.size(), expectedDataList.size());

        for(int i = 0; i < weatherDataList.size(); i++) {
            compareWeatherData(weatherDataList.get(i), expectedDataList.get(i));
        }

    }

    private void compareWeatherData(WeatherData weatherData, WeatherData expectedWeatherData) {
        assertEquals(weatherData.getDay(), expectedWeatherData.getDay());
        assertEquals(weatherData.getMinTemperature(), expectedWeatherData.getMinTemperature());
        assertEquals(weatherData.getMaxTemperature(), expectedWeatherData.getMaxTemperature());
    }

}
