import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public void setnoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public int getnoOfGuesses() {
        return noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        sc.close();
    }

    boolean isCorrect() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes, You guessed it right, it was %d\nYou guessed it in %d\nattempts", number,
                    noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too less....");
        } else if (inputNumber > number) {
            System.out.println("Too high....");
        }
        return false;
    }
}

public class Ex_3_Soln {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            g.isCorrect();
        }
    }
}