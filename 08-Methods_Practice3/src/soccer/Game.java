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
    
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals; //Había un error en esta línea, fue necesario agregar el arreglo.

    public void playGame() {
        playGame(6);
    }
    
    public void playGame(int maxGoals) {
        int numberOfGoals = (int) (Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);
    }
    
    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.goals){
            returnString.append("Gol anotado a los ")
                        .append(currGoal.theTime)
                        .append(" minutos por ")
                        .append(currGoal.thePlayer.playerName)
                        .append(" of ")
                        .append(currGoal.theTeam.teamName)
                        .append("\n");
        }
        return returnString.toString();
    }
}