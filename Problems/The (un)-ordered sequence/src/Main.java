import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        boolean ordered = false;
        int storeNumIncrease  = 0;
        int storeNumDecrease = num;

        while (num != 0) {
            if (num == 0) {
                break;
            }
            if (num < storeNumDecrease) {
                storeNumDecrease = num;
                if (num > storeNumDecrease) {
                    ordered = false;
                }
                ordered = true;
            } else if (num > storeNumIncrease) {
                storeNumIncrease = num;
                if (num < storeNumIncrease) {
                    ordered = false;
                }
                ordered = true;
            } else {
                ordered = false;
            }
            num = scanner.nextInt();
        }
        System.out.println(ordered);
    }
}