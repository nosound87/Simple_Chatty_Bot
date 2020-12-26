import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneGroup = scanner.nextInt();
        int twoGroup = scanner.nextInt();
        int threeGroup = scanner.nextInt();

        int oneClass = oneGroup / 2 + oneGroup % 2;
        int twoClass = twoGroup / 2 + twoGroup % 2;
        int threeClass = threeGroup / 2 + threeGroup % 2;

        System.out.println(oneClass + twoClass + threeClass);

    }
}
