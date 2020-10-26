import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimumAmount = scanner.nextInt();
        int maximumAmount = scanner.nextInt();
        int realAmount = scanner.nextInt();

        if (realAmount < minimumAmount) {
            System.out.println("Deficiency");
        } else if (realAmount > maximumAmount) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}