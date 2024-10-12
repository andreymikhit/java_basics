// импорт библиотек
import java.util.Random;

class HelloWorld3 {
  public static void main(String[] args) {
    Random rnd = new Random();
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello, world " + rnd.nextInt(10) + "!");
      System.out.println(rnd.nextFloat(1000));
      }
    }
}