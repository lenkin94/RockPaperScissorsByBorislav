import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose [r]ock, [p]aper or [s]cissors: ");

        String input = scanner.nextLine();
        String playerMove = "";

        if (input.equals("r") || input.equals("rock")){
            playerMove = "Rock";
        }
        else if (input.equals("p") || input.equals("paper")){
            playerMove = "Paper";
        }
        else if (input.equals("s") || input.equals("scissors")) {
            playerMove = "Scissors";
        }
        else {
            System.out.println("Invalid input. Try Again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";

        switch (computerRandomNumber){
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
        }
        System.out.printf("The computer chose %s\n", computerMove);

        if (playerMove.equals("Rock") && computerMove.equals("Scissors") ||
        playerMove.equals("Scissors") && computerMove.equals("Paper") ||
        playerMove.equals("Paper") && computerMove.equals("Rock")){
            System.out.println("You win.");
        }
        else if (playerMove.equals("Scissors") && computerMove.equals("Rock") ||
                playerMove.equals("Paper") && computerMove.equals("Scissors") ||
                playerMove.equals("Rock") && computerMove.equals("Paper")){
            System.out.println("You lose.");
        }
        else {
            System.out.println("This game is draw.");
        }
    }
}