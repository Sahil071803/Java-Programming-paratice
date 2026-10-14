import java.util.Scanner;
// import java.util.*;


// public class Input{

//     public static void main(String[] args){

//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the Number: ");

//         int rollno = input.nextInt();

//         System.out.println("My rollno is : " + rollno);




//         input.close();


//     }
// }


public class Input{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name in register : ");


        String name = sc.next();

        System.out.println("My name is : " + name);


        sc.close();
    }
}

