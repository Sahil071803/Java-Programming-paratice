import java.util.Scanner;

public class Studentregistration {

    static void registrationStudent(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name : ");

        String name = sc.nextLine();


        System.out.print("Enter the Age : ");

        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Course : ");

        String course = sc.nextLine();

        System.out.print("Enter the RegNo : ");

        int Regno = sc.nextInt();


        System.out.println("\n------Student Registration Details ----");

        System.out.println("Enter the Name : " + name);

        System.out.println("Enter the Age : " + age);

        System.out.println("Enter the Course : " + course);

        System.out.println("Enter the Regno : " + Regno);


    }


    public static void main(String[] args){

        System.out.println("----Welcome to Student Registration System----");

        registrationStudent();

        
    }
}
