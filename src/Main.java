public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 15;
    int sum = addNumbers(x, y);
    System.out.println("Сумма " + x + " и " + y + " равна: " + sum);
  }
  public static int addNumbers(int a, int b) {
    return a + b;
  }
}