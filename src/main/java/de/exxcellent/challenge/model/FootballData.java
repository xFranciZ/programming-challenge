package de.exxcellent.challenge.model;

public class FootballData {
    private String teamName;
    private int goals;
    private int allowedGoals;

    public FootballData(String teamName, int goals, int allowedGoals) {
        this.teamName = teamName;
        this.goals = goals;
        this.allowedGoals = allowedGoals;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGoals() {
        return goals;
    }

    public int getAllowedGoals() {
        return allowedGoals;
    }
}
