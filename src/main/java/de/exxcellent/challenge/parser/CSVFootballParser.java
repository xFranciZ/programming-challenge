package de.exxcellent.challenge.parser;

import de.exxcellent.challenge.model.FootballData;

/**
 * Class for parsing a dataset from a CSV file into an object of FootballData.
 */
public class CSVFootballParser implements CSVParser<FootballData> {

    @Override
    public FootballData parse(String[] dataSet) {
        return  new FootballData(dataSet[0],
                Integer.parseInt(dataSet[5]),
                Integer.parseInt(dataSet[6]));
    }

}
