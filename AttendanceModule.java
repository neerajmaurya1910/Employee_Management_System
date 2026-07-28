import java.util.Scanner;

public class AttendanceModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Present (P) or Absent (A): ");
        char status = sc.next().charAt(0);

        if(status == 'P' || status == 'p'){
            System.out.println("Attendance Marked: Present");
        } else if(status == 'A' || status == 'a'){
            System.out.println("Attendance Marked: Absent");
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}