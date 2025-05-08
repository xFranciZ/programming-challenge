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
        expectedDataList.add(new WeatherData(1, 1,10));
        expectedDataList.add(new WeatherData(2,5,11));
        expectedDataList.add(new WeatherData(3, 2,8));


        CSVDataLoader<WeatherData> csvWeatherDataLoader = new CSVDataLoader<>(new CSVWeatherParser());
        List<WeatherData> weatherDataList = csvWeatherDataLoader.load("/weather_test.csv");

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
