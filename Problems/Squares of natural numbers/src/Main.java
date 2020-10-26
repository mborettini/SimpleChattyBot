import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        int i = 1;
        int result = 0;

        while (result <= val && Math.pow(i, 2) <= val) {
            result = (int) Math.pow(i, 2);
            i++;
            System.out.println(result);
        }
    }
}