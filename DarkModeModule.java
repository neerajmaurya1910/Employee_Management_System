import java.util.Scanner;

public class DarkModeModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Theme Settings =====");
        System.out.println("1. Light Mode");
        System.out.println("2. Dark Mode");
        System.out.print("Choose Theme: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                // Reset to default terminal colors
                System.out.print("\u001B[0m");
                System.out.println("Light Mode Enabled");
                break;

            case 2:
                // White text on black background
                System.out.print("\u001B[37;40m");
                System.out.println("Dark Mode Enabled");
                System.out.println("Welcome to Employee Management System");
                // Reset colors after printing
                System.out.print("\u001B[0m");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}