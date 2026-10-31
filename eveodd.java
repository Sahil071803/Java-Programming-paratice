import java.util.Scanner;

public class eveodd{

    static void checkEvenOdd (int n){
        if(n % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Hii Sahil....");

        System.out.print("Enter the Number : ");

        int Number = in.nextInt();

        checkEvenOdd(Number);


        in.close();

    }
}