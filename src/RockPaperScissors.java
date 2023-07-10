import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Player A, enter your move (R/P/S):");
            String moveA = scanner.next().toUpperCase();
            while (!moveA.equals("R") && !moveA.equals("P") && !moveA.equals("S")) {
                System.out.println("Invalid move. Enter R, P, or S:");
                moveA = scanner.next().toUpperCase();
            }
            System.out.println("Player B, enter your move (R/P/S):");
            String moveB = scanner.next().toUpperCase();

            while (!moveB.equals("R") && !moveB.equals("P") && !moveB.equals("S")) {
                System.out.println("Invalid move. Enter R, P, or S:");
                moveB = scanner.next().toUpperCase();
            }
            System.out.println("Player A chose: " + moveA);
            System.out.println("Player B chose: " + moveB);
            String result;
            if (moveA.equals(moveB)) {
                result = "It's a tie!";
            } else if ((moveA.equals("R") && moveB.equals("S")) ||
                    (moveA.equals("P") && moveB.equals("R")) ||
                    (moveA.equals("S") && moveB.equals("P"))) {
                result = "Player A wins!";
            } else {
                result = "Player B wins!";
            }
            System.out.println(result);
            System.out.print("Play again? (Y/N): ");
            String playAgainChoice = scanner.next();
            playAgain = playAgainChoice.equalsIgnoreCase("Y");
        }
    }
}

