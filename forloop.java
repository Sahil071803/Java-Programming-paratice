import java.util.Scanner;

public class forloop {

    public static void main(String[] args){

        // for(int i = 0; i <= 10; i++){
        //     System.out.println(i * 2);
        // }

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number : ");

        int n = in.nextInt();

        

        for(int num = 0; num <= 10; num++){
            System.out.println(n + " x " + num + " = " + (n * num) );
        }
    }
    
}
