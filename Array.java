import java.util.Scanner;

public class Array {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];

        arr[0] = 33;

        arr[1] = 54;

        arr[2] = 58;

        arr[3] = 7789;

        arr[4] = 441;

        arr[5] = 554;

        System.out.print(arr[4]);

        for(int i = 0; i < arr.length; i++){

            arr[i] = in.nextInt();


            System.out.print(arr[i]);


        
        }

        
    }
}
