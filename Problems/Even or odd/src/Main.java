import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int val = scanner.nextInt();
            if (val == 0) {
                break;
            } else if (val % 2 == 00) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}