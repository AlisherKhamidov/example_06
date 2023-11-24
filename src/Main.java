public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        int z = calcSum(x, y);
        System.out.println(z);
    }

    private static int calcSum(int x, int y) {
        return x + y;
    }
}