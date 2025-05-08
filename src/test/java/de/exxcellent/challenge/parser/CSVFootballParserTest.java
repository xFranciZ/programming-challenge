package de.exxcellent.challenge.parser;

import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.model.WeatherData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVFootballParserTest {

    @Test
    public void testCSVFootballParser() {
        CSVFootballParser csvFootballParser = new CSVFootballParser();
        String[] dataSet = {"Arsenal","38","26","9","3","79","36","87"}; //Team,Games,Wins,Losses,Draws,Goals,Goals Allowed,Points
        FootballData data = csvFootballParser.parse(dataSet);

        assertEquals("Arsenal", data.getTeamName());
        assertEquals(79,data.getGoals());
        assertEquals(36, data.getAllowedGoals());
    }
}
