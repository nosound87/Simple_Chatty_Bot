import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        int counter = 1;

        while (n <= m) {
            n *= ++counter;
        }
        System.out.println(counter);
    }
}
