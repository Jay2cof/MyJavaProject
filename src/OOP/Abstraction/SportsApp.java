package OOP.Abstraction;

public class SportsApp {
    public static void main(String[] args) {

        Sports football = new Sports("Nigeria","Ghana", 2);
        System.out.println(football.getWinners());
        football.getWinners();
        System.out.println(football.getLosers());
        football.getLosers();
        System.out.println(football.getScores());
        football.getScores();
        System.out.println();

        football.setScores(3);
        System.out.println(football.getScores());

        System.out.println();

        Athletic swimming = new Athletic();
        swimming.Playing();
        swimming.TeamWork();
        swimming.Location();
        swimming.Dangerous();

        System.out.println();

        BoardGames chess = new BoardGames();
        chess.Playing();
        chess.TeamWork();
        chess.Location();
        chess.Dangerous();

        System.out.println();

        IceHockey newGame = new IceHockey("Justice,", "Hackers", 10);
        newGame.Location();
        newGame.Ski();
        newGame.Dangerous();




    }
}
