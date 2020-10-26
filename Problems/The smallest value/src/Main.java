import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();

        long n = 0;
        long result = 1;

        while (result <= m) {
            result = result * (n + 1);
            n++;
        }

        System.out.println(n);

    }
}