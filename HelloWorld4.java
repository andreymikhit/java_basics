// библиотека random, system
import java.util.Random;

class HelloWorld4 { 
  public static void main(String[] args) {
    Random rnd = new Random();
    for (int i = 0; i < 50; i++) {
      System.out.print(rnd.nextInt(10));
      }
    System.out.print("\n");
    for (int i = 0; i < 10; i++) {
      System.out.print(rnd.nextInt(100) + " ");
      }
    }
}