package de.exxcellent.challenge.parser;

import de.exxcellent.challenge.model.WeatherData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVWeatherParserTest {

    @Test
    public void testCSVWeatherParser() {
        CSVWeatherParser parser = new CSVWeatherParser();
        String[] dataSet = {"1", "20", "8"}; //Day,MxT,MnT
        WeatherData data = parser.parse(dataSet);

        assertEquals(1, data.getDay());
        assertEquals(8,data.getMinTemperature());
        assertEquals(20, data.getMaxTemperature());
    }
}
