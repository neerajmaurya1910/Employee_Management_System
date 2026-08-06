import java.util.Scanner;

public class SearchEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int storedID = 101;
        String storedName = "Rahul";

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        if(id == storedID){
            System.out.println("Employee Found");
            System.out.println("Name: " + storedName);
        } else{
            System.out.println("Employee Not Found");
        }


        if(id == storedID){
            System.out.println("Employee Found");
            System.out.println("Name: " + storedName);
        } else{
            System.out.println("Employee Not Found");
        }
        sc.close();
    }
}