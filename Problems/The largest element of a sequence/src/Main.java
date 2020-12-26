import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int highDigit = 0;
        
        while (number != 0) {
            highDigit = number > highDigit ? number : highDigit;
            number = scanner.nextInt();
        }
        System.out.println(highDigit);
    }
}
