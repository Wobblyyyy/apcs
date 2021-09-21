import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try (Scanner inputStream = new Scanner(System.in)) {
      int a = inputStream.nextInt();
      int b = inputStream.nextInt();
      float sum = a + b;
      
      System.out.println(
        "The sum of " + a + " and " + b +
          " is " + sum + "."
      );
    } catch (Exception e) {

    }
  }
}
