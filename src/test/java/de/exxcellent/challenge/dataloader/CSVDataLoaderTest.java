package de.exxcellent.challenge.dataloader;

import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.model.WeatherData;
import de.exxcellent.challenge.parser.CSVFootballParser;
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

    @Test
    public void testCSVLoaderWithFootballData() {
        List<FootballData> expectedDataList = new ArrayList<>();
        expectedDataList.add(new FootballData("Arsenal",79,36));
        expectedDataList.add(new FootballData("Liverpool", 67,30));
        expectedDataList.add(new FootballData("Manchester United", 87,45));

        CSVDataLoader<FootballData> csvFootballDataLoader = new CSVDataLoader<>(new CSVFootballParser());
        List<FootballData> footballDataList =  csvFootballDataLoader.load("de/exxcellent/challenge/football_test.csv");

        assertEquals(footballDataList.size(), expectedDataList.size());

        for(int i = 0; i < footballDataList.size(); i++) {
            compareFootballData(footballDataList.get(i), expectedDataList.get(i));
        }
    }

    private void compareFootballData(FootballData footballData, FootballData expectedFootballData) {
        assertEquals(footballData.getTeamName(), expectedFootballData.getTeamName());
        assertEquals(footballData.getGoals(), expectedFootballData.getGoals());
        assertEquals(footballData.getAllowedGoals(), expectedFootballData.getAllowedGoals());
    }

}
