import java.util.Scanner;

public class DataFromUser {
    public static int[] getTwoDatesFromUser() {
        int[] dates = new int[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date from which you want to start filtering: ");
        int startDate = scanner.nextInt();
        System.out.println("Enter the date on which you want to stop filtering: ");
        int endDate = scanner.nextInt();

        dates[0] = startDate;
        dates[1] = endDate;

        return dates;
    }

    public static String[] getActorsDataFromUser() {
        String[] names = new String[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter actor's first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter actor's last name: ");
        String lastName = scanner.nextLine();

        names[0] = firstName;
        names[1] = lastName;

        return names;
    }
}