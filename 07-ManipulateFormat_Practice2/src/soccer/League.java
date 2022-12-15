/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Edgar Anaya
 */
public class League {
    public static void main(String[] args) {
        //TODO: code application logic here

        // Create team1      
        Player player1 = new Player();
        player1.playerName = "Lionel Messi";

        Player player2 = new Player();
        player2.playerName = "Lautaro Martinez";

        Player player3 = new Player();
        player3.playerName = "Emiliano Martinez";
        
        Player[] thePlayers = { player1, player2, player3 };
        
        Team team1 = new Team();
        team1.teamName = "ARGENTINA";
        team1.playerArray = thePlayers;
        
        // Create team2
        Team team2 = new Team();
        team2.teamName = "FRANCIA";
        
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Kylian Mbappe";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Kingsley Coman";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Alphonse Areola";
        
        //player1.playerName = "Robert Service";
        
        /*
        System.out.println(team1.teamName);
        for (Player thePlayer: team1.playerArray){
            System.out.println(thePlayer.playerName);
        }

        System.out.println(team2.teamName);
        for (Player thePlayer: team2.playerArray){
            System.out.println(thePlayer.playerName);
        }
        */
        
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[0];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Gol anotado a los " + currGame.goals[0].theTime + " mins por " + currGame.goals[0].thePlayer.playerName + " de " + currGame.goals[0].theTeam.teamName);
        System.out.println("");
        
        /* Practice 7-1. Add code for finding a player within team2 here */
        
        for (Player thePlayer: team1.playerArray){
            if (thePlayer.playerName.matches(".*Mar.*")){
                System.out.println("Encontrado: " + thePlayer.playerName);
                System.out.println("Apellido: " + thePlayer.playerName.split(" ")[1]);
                System.out.println("");
            }
        }

        for (Player thePlayer: team1.playerArray){
            String name[] = thePlayer.playerName.split(" ");
            StringBuilder familyNameFirst = new StringBuilder();
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
        }
    }
}