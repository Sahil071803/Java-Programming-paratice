import java.util.Scanner;


public class Sum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Numbers  : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Numbers  : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum : " + sum);

        sc.close();
    }
}
