public class Main {

    public static void main(String[] args) {

        Player[] players = new Player[] {
                new Player("Player 1"),
                new Player("Player 2"),
                new Player("Player 3")
        };

        GuessNumber game = new GuessNumber(10, players);
        game.start();

    }

}
