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
public class League {
    public static void main(String[] args) {
        //TODO: code application logic here
        League theLeague = new League();
                
        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);

        Game currGame = theGames[0];

        currGame.playGame();

        System.out.println(currGame.getDescription());
    }
        
    public Team[] createTeams(){
        // Create teams
        Team team1 = new Team();
        team1.teamName = "ARGENTINA";

        Team team2 = new Team();
        team2.teamName = "FRANCIA";

        Team[] theTeams = { team1, team2 };

        // Create players team1
        Player player1 = new Player();
        player1.playerName = "Lionel Messi";
        Player player2 = new Player();
        player2.playerName = "Lautaro Martinez";
        Player player3 = new Player();
        player3.playerName = "Emiliano Martinez";
        Player[] thePlayers = { player1, player2, player3 };
        theTeams[0].playerArray = thePlayers;

        // Create players team2
        theTeams[1].playerArray = new Player[3];
        theTeams[1].playerArray[0] = new Player();
        theTeams[1].playerArray[0].playerName = "Kylian Mbappe";
        theTeams[1].playerArray[1] = new Player();
        theTeams[1].playerArray[1].playerName = "Kingsley Coman";
        theTeams[1].playerArray[2] = new Player();
        theTeams[1].playerArray[2].playerName = "Alphonse Areola";

        return theTeams;
    }
    
    public Game[] createGames(Team[] theTeams){
        Game theGame = new Game();

        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];

        Game[] theGames = { theGame };

        return theGames;
    }
}