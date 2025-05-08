package de.exxcellent.challenge;

import de.exxcellent.challenge.analyzer.FootballDataAnalyzer;
import de.exxcellent.challenge.analyzer.WeatherDataAnalyzer;
import de.exxcellent.challenge.dataloader.CSVDataLoader;
import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.model.WeatherData;
import de.exxcellent.challenge.parser.CSVFootballParser;
import de.exxcellent.challenge.parser.CSVWeatherParser;

import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        switch (args[0]) {
            case "--weather":
                loadAndAnalyzeWeatherData(args[1]);
                break;
            case "--football":
                loadAndAnalyzeFootballData(args[1]);
                break;
            default:
                System.err.println("Please use --weather or --football to load and analyze data!");
                System.exit(1);
        }
    }

    private static void loadAndAnalyzeWeatherData(String fileName) {
       CSVDataLoader<WeatherData> csvDataLoader = new CSVDataLoader<>(new CSVWeatherParser());
       List<WeatherData> weatherDataList = csvDataLoader.load("de/exxcellent/challenge/" + fileName);

       WeatherDataAnalyzer weatherDataAnalyzer = new WeatherDataAnalyzer();
       WeatherData dataWithSmallestSpread = weatherDataAnalyzer.getDataWithSmallestTemperatureSpread(weatherDataList);

        String dayWithSmallestTempSpread = dataWithSmallestSpread.getDay() + "";
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
    }

    private static void loadAndAnalyzeFootballData(String fileName) {
        CSVDataLoader<FootballData> csvDataLoader = new CSVDataLoader<>(new CSVFootballParser());
        List<FootballData> footballDataList = csvDataLoader.load("de/exxcellent/challenge/" + fileName);

        FootballDataAnalyzer footballAnalyzer = new FootballDataAnalyzer();
        FootballData dataWithSmallestGoalDifference = footballAnalyzer.getDataWithSmallestGoalDifference(footballDataList);

        String teamWithSmallestGoalSpread = dataWithSmallestGoalDifference.getTeamName();
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
