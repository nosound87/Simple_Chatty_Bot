import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                if (counter < number) {
                    System.out.print(i + " ");
                } else {
                    break;
                }
                counter++;
            }
        }
    }
}



