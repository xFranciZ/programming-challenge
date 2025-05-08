package de.exxcellent.challenge.parser;

import de.exxcellent.challenge.model.FootballData;

public class CSVFootballParser implements CSVParser<FootballData> {

    @Override
    public FootballData parse(String[] dataSet) {
        return  new FootballData(dataSet[0],
                Integer.parseInt(dataSet[5]),
                Integer.parseInt(dataSet[6]));
    }

}
