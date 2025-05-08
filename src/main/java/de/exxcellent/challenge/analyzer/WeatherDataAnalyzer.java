package de.exxcellent.challenge.analyzer;

import de.exxcellent.challenge.model.WeatherData;

import java.util.List;

public class WeatherDataAnalyzer {

    public WeatherData getDataWithSmallestTemperatureSpread(List<WeatherData> weatherDataList) {
        WeatherData result = weatherDataList.get(0);
        int resultSpread = result.getMaxTemperature() - result.getMinTemperature();
        int currentSpread;

        for(int i = 1; i < weatherDataList.size(); i++) {
            currentSpread = weatherDataList.get(i).getMaxTemperature() - weatherDataList.get(i).getMinTemperature();

            if(currentSpread < resultSpread) {
                resultSpread = currentSpread;
                result = weatherDataList.get(i);
            }
        }

        return result;
    }
}

