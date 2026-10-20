import java.util.Scanner;

public class largestnum {
    public static void main(String[] args){


        Scanner in  = new Scanner(System.in);

        System.out.print("Enter the numbers : ");

        int a = in.nextInt();

        System.out.print("Enter the numbers : ");

        int b = in.nextInt();

        System.out.print("Enter the numbers : ");

        int c = in.nextInt();


        // int max = a;
        
        // if (b > max){
        //     max = b;

        // }

        // if ( c > max){
        //     max = c;
        // }

        // int max = 0;

        // if (a > b){
        //     max = a;
        // }
        // else{
        //     max = b;
        // }

        // if (c > max);


        int max = Math.max(c, Math.max(a , b));

        System.out.println("The Largest Number is : " + max);
        




    }
}
