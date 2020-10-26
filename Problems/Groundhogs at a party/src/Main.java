import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peanutButterCupsNumber = scanner.nextInt();
        boolean ifWeekend = scanner.nextBoolean();

        boolean ifWeekCupsNumberIsSatisfying = peanutButterCupsNumber >= 10 && peanutButterCupsNumber <= 20;
        boolean ifWeekPartyWasSuccessful = ifWeekCupsNumberIsSatisfying && !ifWeekend;

        boolean ifWeekendCupsNumberIsSatisfying = peanutButterCupsNumber >= 15 && peanutButterCupsNumber <= 25;
        boolean ifWeekendPartyWasSuccessful = ifWeekendCupsNumberIsSatisfying && ifWeekend;

        System.out.println(ifWeekPartyWasSuccessful || ifWeekendPartyWasSuccessful);
    }
}