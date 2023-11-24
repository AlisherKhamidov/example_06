public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        int result = sum(x, y);

        System.out.println("The sum of " + x + " and " + y + " = " + result);
    }

    private static int sum(int x, int y) {
        return x + y;
    }
}