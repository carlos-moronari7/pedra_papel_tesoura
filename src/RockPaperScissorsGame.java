import java.util.Scanner;
public class RockPaperScissorsGame {
    // Main class that controls the game
        private final Player player1;
        private final Player player2;

        public RockPaperScissorsGame(Player player1, Player player2) {
            this.player1 = player1;
            this.player2 = player2;
        }

        // Method to determine the winner of a round
        private void determineWinner(Option player1Option, Option player2Option) {
            if (player1Option == player2Option) {
                System.out.println("Draw!");
            } else if ((player1Option == Option.ROCK && player2Option == Option.SCISSORS) ||
                    (player1Option == Option.PAPER && player2Option == Option.ROCK) ||
                    (player1Option == Option.SCISSORS && player2Option == Option.PAPER)) {
                System.out.println("Player 1 wins!");
            } else {
                System.out.println("Player 2 wins!");
            }
        }

        // Method to start the game
        public void play() {
            Scanner scanner = new Scanner(System.in);
            boolean continuePlaying = true;

            while (continuePlaying) {
                Option player1Option = player1.play();
                Option player2Option = player2.play();
                System.out.println("Player 1 chose: " + player1Option);
                System.out.println("Player 2 chose: " + player2Option);
                determineWinner(player1Option, player2Option);

                System.out.println("Do you want to play again? (y/n)");
                String response = scanner.next();
                continuePlaying = response.equalsIgnoreCase("y");
            }

            scanner.close();
        }

}
