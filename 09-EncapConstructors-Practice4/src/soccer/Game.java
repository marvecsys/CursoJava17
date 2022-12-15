/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

import utility.GameUtils;

/**
 *
 * @author Edgar Anaya
 */
public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals; //Había un error en esta línea, fue necesario agregar el arreglo.

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
    
    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the goals
     */
    public Goal[] getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
    
    public void playGame() {
        playGame(6);
    }
    
    public void playGame(int maxGoals) {
        int numberOfGoals = (int) (Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);
    }
    
    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.getGoals()){
            returnString.append("Gol anotado a los ")
                        .append(currGoal.getTheTime())
                        .append(" minutos por ")
                        .append(currGoal.getThePlayer().getPlayerName())
                        .append(" of ")
                        .append(currGoal.getTheTeam().getTeamName())
                        .append("\n");
        }
        return returnString.toString();
    }
}