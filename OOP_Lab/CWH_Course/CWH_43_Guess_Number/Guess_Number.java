import java.util.Random;
import java.util.Scanner;

class Game {
    int guess;
    int random;
    int userInput;
    int computerInput;

    Game() {
        Random random = new Random();
        computerInput = random.nextInt(100);
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number from 0 - 100: ");
        userInput = sc.nextInt();
    }

    public boolean isCorrect() {
        if (userInput == computerInput) {
            return true;
        } else {
            return false;
        }
    }
}

public class Guess_Number {
    public static void main(String[] args) {
        Game p1 = new Game();
        p1.takeUserInput();
        if (p1.isCorrect()) {
            System.out.println("Your guess is right.");
        } else {
            System.out.println("Oops!! Please try again!");
            p1.takeUserInput();
        }
    }
}