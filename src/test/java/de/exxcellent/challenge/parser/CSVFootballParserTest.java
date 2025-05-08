package de.exxcellent.challenge.parser;

import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.model.WeatherData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVFootballParserTest {

    @Test
    public void testCSVFootballParser() {
        CSVFootballParser csvFootballParser = new CSVFootballParser();
        String[] dataSet = {"Arsenal", "10", "5"}; //Team,Goals,allowedGoals
        FootballData data = csvFootballParser.parse(dataSet);
        
        assertEquals("Arsenal", data.getTeamName());
        assertEquals(10,data.getGoals());
        assertEquals(5, data.getAllowedGoals());
    }
}
