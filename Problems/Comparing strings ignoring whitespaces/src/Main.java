import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        System.out.println(text1.replace(" ", "").equals(text2.replace(" ", "")));
    }
}