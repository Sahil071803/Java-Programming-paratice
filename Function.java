import java.util.Scanner;


public class Function{
    public static void main(String[] args){

    //     num();

    greet();


        
    // }

    // static void num(){
    //         Scanner in =  new Scanner(System.in);

    //         System.out.print("Enter the Num1 : ");

    //         int num1 = in.nextInt();


    //         System.out.print("Enter the Num2 : ");
           
    //         int num2 = in.nextInt();
            

    //         int sum = num1 + num2;

    //         System.out.println("The Total number is" + " = " + sum);


    //         in.close();


   

       


    }

    static void greet(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Firstname : ");

        String First = in.next();

        System.out.print("Enter the Lastname : ");

        String Last = in.next();

        
            System.out.print("The Name is " + " = " + First + " " +Last);
    
        }   
}


