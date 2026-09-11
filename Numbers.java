import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        
        int x = sc.nextInt();
        int y = sc.nextInt();

        int z = x+y;

        System.out.print("Sum is = " + z);

        sc.close();


    }
}
