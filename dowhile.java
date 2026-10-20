import java.util.Scanner;

public class dowhile{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number : ");

        int num = in.nextInt();

        int n = 0;

        do{

            System.out.println(num + " x " + n + " = " + (num * n) );
            n ++;

        }while(n <= 10);


        // int n = 0;

        // do{

        //     System.out.println(n);
        //     n++;


        // }
        // while(n <= 10);

    }
}