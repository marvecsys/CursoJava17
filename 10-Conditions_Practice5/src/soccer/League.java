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

        for (Game currGame: theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }

        theLeague.showBestTeam(theTeams);
    }
        
    public Team[] createTeams(){
        // Create players team1
        Player player1 = new Player("Lionel Messi");
        Player player2 = new Player("Lautaro Martinez");
        Player player3 = new Player("Emiliano Martinez");
        Player[] thePlayers = { player1, player2, player3 };

        // Create teams
        Team team1 = new Team("ARGENTINA", thePlayers);
        Team team2 = new Team("FRANCIA");

        Team[] theTeams = { team1, team2 };

        // Create players team2
        theTeams[1].setPlayerArray(new Player[3]);
        theTeams[1].getPlayerArray()[0] = new Player("Kylian Mbappe");
        theTeams[1].getPlayerArray()[1] = new Player("Kingsley Coman");
        theTeams[1].getPlayerArray()[2] = new Player("Alphonse Areola");

        return theTeams;
    }
    
    public Game[] createGames(Team[] theTeams){
        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[0], theTeams[1]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[0], theTeams[1]);
        
        Game[] theGames = { theGame, theGame2, theGame3, theGame4 };
        return theGames;
    }
    
    public void showBestTeam(Team[] theTeams) {
        Team currBestTeam = theTeams[0];
        System.out.println("\nTeam Points");
        
        for (Team currTeam: theTeams) {
            System.out.println(currTeam.getTeamName() + ": " + currTeam.getPointsTotal() + ":" + currTeam.getGoalsTotal());
            //currBestTeam = currTeam.getPointsTotal() > currBestTeam.getPointsTotal() ? currTeam : currBestTeam;
            if (currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
                currBestTeam = currTeam;
            } else if (currTeam.getPointsTotal() == currBestTeam.getPointsTotal()) {
                if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
                    currBestTeam = currTeam;
                }
            }
        }
        
        System.out.println("El ganador de este campeonato es la selección de " + currBestTeam.getTeamName());
    }
    
}