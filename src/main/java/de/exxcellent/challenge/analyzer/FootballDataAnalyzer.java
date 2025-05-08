package de.exxcellent.challenge.analyzer;

import de.exxcellent.challenge.model.FootballData;

import java.util.List;

/**
 * Class for analyzing FootballData
 */
public class FootballDataAnalyzer {

    public FootballData getDataWithSmallestGoalDifference(List<FootballData> footballDataList) {
        FootballData result = footballDataList.get(0);
        int resultSpread = Math.abs(result.getGoals() - result.getAllowedGoals());
        int currentSpread;

        for (int i = 1; i < footballDataList.size(); i++) {
            currentSpread = Math.abs(footballDataList.get(i).getGoals() - footballDataList.get(i).getAllowedGoals());

            if (currentSpread < resultSpread) {
                resultSpread = currentSpread;
                result = footballDataList.get(i);
            }
        }

        return result;
    }
}
