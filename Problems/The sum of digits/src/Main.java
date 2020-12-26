import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeDigits = scanner.nextInt();
        int sum = (threeDigits / 100) + (threeDigits % 100 / 10) + ((threeDigits % 100) % 10);

        System.out.println(sum);
    }
}