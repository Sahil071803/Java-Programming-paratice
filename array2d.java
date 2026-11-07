
import java.util.Scanner;

public class array2d{

    public static void main(String[] args){

        // int [] [] arr =  {
        //     {10 , 20},
        //     {30, 40}
        // };

        // for (int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }

        //     System.out.println();
        // }


        Scanner in = new Scanner(System.in);

        int[] [] arr = new int[3] [2];

        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){

                arr[row][col] = in.nextInt();
            }


        }

        System.out.println("Array elements");

        for(int row=0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){

                System.out.print(arr[row][col] + " ");
            }

            System.out.println();
        }

        in.close();
    }
}