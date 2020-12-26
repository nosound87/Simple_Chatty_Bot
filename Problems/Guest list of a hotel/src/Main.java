import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] myStringArray = new String[8];

        for (int i = 0; i <= 7; i++) {
            myStringArray[i] = scanner.next();
        }

        int x = myStringArray.length - 1;
        while (x >= 0) {
            System.out.println(myStringArray[x]);
            x -= 1;
        }

    }
}