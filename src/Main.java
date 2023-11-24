public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 15;

    int sum = sumOfNumbers(x, y);
    System.out.println(x + " + " + y + " = " + sum);

  }

  private static int sumOfNumbers(int a, int b) {
    int sum = a + b;
    return sum;
  }
}