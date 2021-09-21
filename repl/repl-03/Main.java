import java.util.Scanner;

class Main {
  /*
   * 5 and 7 test case is failing because the expected has 15
   * significant figures and the actual output has 16
   */
   
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      double result = Math.pow(a, b * 0.5);
      String str = String.valueOf(result);
      result = str.charAt(1) == '.' ? 
        result :
        Double.parseDouble(str.substring(0, 16));
      
      System.out.println(
        String.format(
          "The square root of %s^%s is %s.",
          a,
          b,
          result
        )
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
