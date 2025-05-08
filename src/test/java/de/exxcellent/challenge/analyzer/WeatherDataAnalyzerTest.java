package de.exxcellent.challenge.analyzer;

import de.exxcellent.challenge.model.WeatherData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class WeatherDataAnalyzerTest {

    @Test
    public void testDataWithSmallestTemperatureSpread() {
        List<WeatherData> weatherDataList = new ArrayList<>();
        weatherDataList.add(new WeatherData(1, 5,10));
        weatherDataList.add(new WeatherData(2, 8,20));
        weatherDataList.add(new WeatherData(3, 12, 15));
        weatherDataList.add(new WeatherData(4, 15,20));

        WeatherDataAnalyzer weatherDataAnalyzer = new WeatherDataAnalyzer();
        WeatherData result = weatherDataAnalyzer.getDataWithSmallestTemperatureSpread(weatherDataList);

        assertEquals(3, result.getDay());
    }

}
