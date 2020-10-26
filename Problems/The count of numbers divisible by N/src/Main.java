import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); //100
        int b = scanner.nextInt(); //200
        int n = scanner.nextInt(); //13

//        int counter = 0;
//
//        for (int i = a; i <= b; i++) {
//            if (i % n == 0) {
//                counter += 1;
//            }
//        }
//
//        System.out.println(counter);

        System.out.println((b - a) / n + 1);
    }
}