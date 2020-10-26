import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int bridgeNumber = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= bridgeNumber; i++) {
            int bridgeHigh = scanner.nextInt();
            if (n < bridgeHigh) {
                counter++;
                continue;
            } else {
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }

        if (bridgeNumber == counter) {
            System.out.println("Will not crash");
        }
    }
}