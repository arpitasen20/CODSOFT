import java.util.*;

class OP {
    private int noOfGuess;
    private int compInput;
    private int userInput;
    Random r = new Random();

    public OP() {
        this.noOfGuess = 0;
        this.compInput = r.nextInt(100);
    }

    public void takeInput() {
        System.out.println("Guess number : ");
        Scanner sc = new Scanner(System.in);
        this.userInput = sc.nextInt();
        this.isCorrect();
        sc.close();
    }

    public void isCorrect() {
        if (this.userInput == this.compInput) {
            System.out.println("Your guess is correct!!");
            System.out.println("The number was " + this.compInput);
            this.noOfGuess++;
            return;
        } else if (this.compInput < this.userInput) {
            System.out.println("The guessed number is too high !!");
            this.noOfGuess++;
            this.takeInput();
        } else {
            System.out.println("The guessed number is too low !!");
            this.noOfGuess++;
            this.takeInput();
        }
    }

    public void getGuess() {
        System.out.println("You took " + this.noOfGuess + " guesses!!");
    }
}
public class guessgame {
    public static void main(String[] args) {
        OP task1 = new OP();
        task1.takeInput();
        task1.getGuess();
    }
}

