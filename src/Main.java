// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                Player player1 = new Player() {
                    @Override
                    public Option play() {
                        System.out.println("Player 1, choose an option (1 - Rock, 2 - Paper, 3 - Scissors): ");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                return Option.ROCK;
                            case 2:
                                return Option.PAPER;
                            case 3:
                                return Option.SCISSORS;
                            default:
                                System.out.println("Invalid option. Choose again.");
                                return play();
                        }
                    }
                };

                Player player2 = new Player() {
                    @Override
                    public Option play() {
                        return Option.random();
                    }
                };

                RockPaperScissorsGame game = new RockPaperScissorsGame(player1, player2);
                game.play();

                scanner.close();
            }
        }
