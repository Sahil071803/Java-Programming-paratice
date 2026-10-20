import java.util.Scanner;

public class whileloop{
    public static void main(String[] args){


        // int count = 0;

        // while(count <= 10){
        //     System.out.println(count * 2);
        //     count++;
        // }

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number : ");

        int n = in.nextInt();

        int num = 0;
        while(num <= 10){

            System.out.println(n + " x " + num + " = " + (n * num));

            num++;
        }
    }
}