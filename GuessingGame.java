import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Guessing Game. Let me pick a number in between of 1 and 100 ");
        System.out.println("Instructions of the game are as follows:");
        System.out.println("1.You will get 5 guesses to Guess The number!!");
        System.out.println("2.Once the game is over, you can play it again if you want to");
        System.out.println("Let's Begin!!");
        Scanner sc1 = new Scanner(System.in);
        boolean playAgain;
        int Score = 0;
        do {
            playGame();
            System.out.println("Would you like to play again? true/false");
            playAgain = sc1.nextBoolean();
            if (playAgain == true) {
                playGame();
                Score++;
                break;
            }
        } while (playAgain);
        System.out.println("Thanks for playing!!");
    }

    static void playGame() {
        int myNumber;
        int yourGuess;
        int guessCount;
        int Score = 0;
        myNumber = (int) (100 * Math.random()) + 1;
        guessCount = 0;
        System.out.println();
        System.out.println("First Guess is:");
        Scanner sc = new Scanner(System.in);
        while (true) {
            yourGuess = sc.nextInt();
            guessCount++;
            if (yourGuess == myNumber) {
                System.out.println("You Got it!! The number is" + myNumber + "You guessed it Correct!!");
                Score++;
                break;
            }
            if (guessCount == 5) {
                System.out.println("You didn't get the number in 5 guesses. ");
                System.out.println("Better Luck Next Time!");
                System.out.println("The number was:" + myNumber);
                break;
            }
            if (yourGuess < myNumber)
                System.out.println("The number is too low. Try Again:");
            else if (yourGuess > myNumber)
                System.out.println("The number is too high . Try Again:");
        }
        System.out.println("Your Score is:" + Score);
        System.out.println();
    }
}
