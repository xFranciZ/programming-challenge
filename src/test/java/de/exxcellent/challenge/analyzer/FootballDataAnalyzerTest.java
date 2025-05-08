package de.exxcellent.challenge.analyzer;

import de.exxcellent.challenge.model.FootballData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballDataAnalyzerTest {

    @Test
    public void testDataWithSmallestGoalDifference() {
        List<FootballData> footballDataList = new ArrayList<>();
        footballDataList.add(new FootballData("Arsenal", 5, 10));
        footballDataList.add(new FootballData("Liverpool", 10, 12));
        footballDataList.add(new FootballData("Manchester", 12, 5));
        footballDataList.add(new FootballData("Chelsea", 10, 3));

        FootballDataAnalyzer footballAnalyzer = new FootballDataAnalyzer();
        FootballData result = footballAnalyzer.getDataWithSmallestGoalDifference(footballDataList);

        assertEquals("Liverpool", result.getTeamName());
    }
}
