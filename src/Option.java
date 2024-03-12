import java.util.Random;
public enum Option {
    // Option.java
        ROCK, PAPER, SCISSORS;

        // Method to generate a random option
        public static Option random() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

