import java.util.Scanner;

class Main {
  private static <T> void print(T dividend, T divisor, T quotient) {
    System.out.println(
      String.format(
        "%s/%s=%s",
        dividend,
        divisor,
        quotient
      )
    );
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int intDividend = scanner.nextInt();
      int intDivisor = scanner.nextInt();

      double doubleDividend = (double) intDividend;
      double doubleDivisor = (double) intDivisor;

      int intQuotient = intDividend / intDivisor;
      double doubleQuoteint = doubleDividend / doubleDivisor;

      print(
        intDividend,
        intDivisor,
        intQuotient
      );
      print(
        doubleDividend,
        doubleDivisor,
        doubleQuoteint
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
