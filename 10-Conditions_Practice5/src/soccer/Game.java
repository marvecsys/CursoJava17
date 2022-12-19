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
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();
        
        returnString.append(homeTeam.getTeamName()).append(" vs. ").append(awayTeam.getTeamName()).append( "\n");
        
        for (Goal currGoal: this.getGoals()){
            returnString.append("Gol anotado a los ").append(currGoal.getTheTime())
                        .append(" minutos por ").append(currGoal.getThePlayer().getPlayerName())
                        .append(" of ").append(currGoal.getTheTeam().getTeamName()).append("\n");

            if (currGoal.getTheTeam() == homeTeam) {
                homeTeamGoals++;
                homeTeam.incGoalsTotal(1);
            } else {
                awayTeamGoals++;
                awayTeam.incGoalsTotal(1);
            }
        }

        if (homeTeamGoals == awayTeamGoals) {
            returnString.append("El partido ha concluído con un empate! Se van a los penales!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append("El ganador de este juego es la selección de ").append(homeTeam.getTeamName());
            homeTeam.incPointsTotal(2);
        } else {
            returnString.append("El ganador de ete juego es la selección de ").append(awayTeam.getTeamName());
            awayTeam.incPointsTotal(2);
        }
        returnString.append("\n(").append(homeTeam.getTeamName()).append(" ").append(homeTeamGoals).append(" - ")
                .append(awayTeam.getTeamName()).append(" ").append(awayTeamGoals).append(")\n");

        return returnString.toString();
    }
}