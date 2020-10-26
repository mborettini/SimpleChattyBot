import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x = h - b;
        int y = a - b;

        int z = x / y;
        int r = x % y;

        int result = 0;

        if (r != 0) {
            result = z + 1;
        } else {
            result = z;
        }

        System.out.println(result);

    }
}
