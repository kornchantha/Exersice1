import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Input numbers");
            System.out.println("2. View entered numbers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputNumbers(scanner, numbers);
                    break;
                case 2:
                    viewNumbers(numbers);
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void inputNumbers(Scanner scanner, ArrayList<Integer> numbers) {
        System.out.println("Enter a list of numbers (-1 to stop):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            numbers.add(num);
        }
    }

    private static void viewNumbers(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("No numbers entered yet.");
        } else {
            System.out.println("Entered numbers:");
            for (int n : numbers) {
                System.out.println(n);
            }
        }
    }
}