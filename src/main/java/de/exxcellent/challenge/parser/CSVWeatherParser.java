package de.exxcellent.challenge.parser;

import de.exxcellent.challenge.model.WeatherData;

public class CSVWeatherParser implements CSVParser<WeatherData>{

    @Override
    public WeatherData parse(String[] dataSet) {
        return  new WeatherData(Integer.parseInt(dataSet[0]),
                Integer.parseInt(dataSet[2]),
                Integer.parseInt(dataSet[1]));
    }
}
