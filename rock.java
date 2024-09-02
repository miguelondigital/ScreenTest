import java.util.Random;
import java.util.Scanner;

public class rock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] rps = {"rock", "paper", "scissors"};
        String computerMove, playerMove;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter your move (rock, paper, scissors). To exit the game, type 'exit': ");
            playerMove = scanner.nextLine().toLowerCase();

            if (playerMove.equals("exit")) {
                break;
            }

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move! Please try again.");
                continue;
            }

            int randIndex = random.nextInt(3);
            computerMove = rps[randIndex];

            System.out.println("Computer's move: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                       (playerMove.equals("paper") && computerMove.equals("rock")) ||
                       (playerMove.equals("scissors") && computerMove.equals("paper"))) {

                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }


            // Ask to play again
            System.out.println("Do you want to play again? (yes/no):");
            String playAgainResponse = scanner.nextLine().toLowerCase();
            if (playAgainResponse.equals("no")) {
                playAgain = false;
            }
            else if (playAgainResponse.equals("yes")){
                 ;
            }
            else {
                while(!playAgainResponse.equals("yes") || !playAgainResponse.equals("no")){
                System.out.println("Invalid input, please try again!");
                System.out.println("Do you want to play again? (yes/no):");
                playAgainResponse = scanner.nextLine().toLowerCase();
                if (playAgainResponse.equals("no")) {
                    playAgain = false;
                    break;
                }
                if (playAgainResponse.equals("yes")){
                    playAgain = true;
                    break;
                }
                }
            }
            
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}