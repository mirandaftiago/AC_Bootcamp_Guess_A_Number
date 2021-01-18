public class GuessNumber {

    private int maxGuess;
    private Player[] players;

    public GuessNumber(int maxGuess, Player[] players) {
        this.maxGuess = maxGuess;
        this.players = players;
    }

    public void start() {
        int computerGuess = chooseNumber();
        System.out.println("Computer chooses " + computerGuess);

        boolean endGame = false;

        while(!endGame) {

            for (Player player : players) {
                int playerGuess = player.chooseNumber(maxGuess);
                System.out.println(player.getName() + " chose number " + playerGuess);

                if (playerGuess == computerGuess) {
                    System.out.println(player.getName() + " won! ");
                    endGame = true;
                    break;
                }
            }
        }
    }
    private int chooseNumber() {
        return RandomGenerator.getRandom(maxGuess);
    }
}
