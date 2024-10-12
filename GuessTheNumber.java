// Game GuessTheNumber
import java.util.Random;
import java.util.Scanner;

class GuessTheNumber { 
  public static void main(String[] args) {
    Random rnd = new Random();
    Scanner scanr = new Scanner(System.in);
    int counter, guess, number;
    
    do {
      counter = 0;
      guess = -1;
      number = rnd.nextInt(10);

      while (counter < 3 && guess != number) {
        System.out.print("Guess the number 0...9: ");
        guess = scanr.nextInt();
        if (guess != number) {
          System.out.println("Your number is " + (guess < number ? "less" : "greater"));
          counter++;
          }
      }
      System.out.println("You " + (guess == number ? "win" : "lose") + "! Number was " + number);
      System.out.print("One more game? Yes -- 1 or No -- 0: ");

    } while (scanr.nextInt() == 1);
  }
}