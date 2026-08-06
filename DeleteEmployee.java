import java.util.Scanner;

public class DeleteEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID to Delete: ");
        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        System.out.println("Employee " + id + " deleted successfully.");

        sc.close();
    }
}