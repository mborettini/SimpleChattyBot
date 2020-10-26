import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (scanner.hasNext()) {
            int val = scanner.nextInt();
            sum += val;
            if (val == 0 || sum >= 1000) {
                int result = sum >= 1000 ? sum - 1000 : sum;
                System.out.println(result);
                break;
            }
        }
    }
}