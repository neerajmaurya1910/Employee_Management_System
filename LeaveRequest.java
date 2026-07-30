import java.util.Scanner;

public class LeaveRequest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        
        System.out.println("Leave Request");



        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Reason for Leave: ");
        String reason = sc.nextLine();

        System.out.print("Number of Leave Days: ");
        int days = sc.nextInt();

        System.out.println("\nLeave Request Submitted");
        System.out.println("Employee ID: " + id);
        System.out.println("Reason: " + reason);
        System.out.println("Days: " + days);
        System.out.println("Status: Pending Approval");

        sc.close();
    }
}