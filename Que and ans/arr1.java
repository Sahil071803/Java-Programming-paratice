// Q1. Take 5 numbers from the user and print them.
//  Ans : - import java.util.Scanner;
// public class arr1 {

//     public static void main(String[] args){



//         Scanner in  = new Scanner(System.in);

//         System.out.println("Enter the 5 Numbers :");

//         int[] arr = new int[5];

//         for(int i = 0; i < arr.length ; i++){

//         System.out.print(i + " ");

//           arr[i] = in.nextInt();

         

            
//         }

//         for(int i = 0; i < arr.length; i++){

//             System.out.print(arr[i] +  " ");

//         }

//         System.out.println("Hello Sahil");




//         in.close();

//     }
    
// }



// Q2. Find the sum of all array elements.

// import java.util.Scanner;

// public  class arr1{

//     public static void main(String[] args){

//         Scanner in = new Scanner(System.in);

//         System.out.println("Enter the 5 Number : ");

//         int[] arrSum = new int[5];

//         for(int i = 0; i < arrSum.length; i++){


//             System.out.print("The Index  " +  i + "  is  = " + " ");

//             arrSum[i] = in.nextInt();
//         }

//         System.out.println("<---------- ---------->");

//         System.out.println("The Array 5 num is : ");

//         for(int i = 0; i < arrSum.length; i++){

//             System.out.println(arrSum[i] +  " ");
//         }

//         System.out.println("<---------- ---------->");

//         int sum = 0;

//         for(int i = 0; i < arrSum.length; i++){

//             sum = sum + arrSum[i];

            
//         }


//         System.out.println("Total array sum = "  + sum );

        
//     }
// }




// Q3. Find the largest number.


// import java.util.Scanner;

// public class arr1 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter 5 array numbers:");

//         // Create an array of size 5
//         int[] arrMax = new int[5];

//         // Index variable
//         int i = 0;

//         // Take input using while loop
//         while (i < arrMax.length) {
//             arrMax[i] = sc.nextInt();
//             i++;
//         }

//         System.out.println("<------------------->");

//         // Reset i to print the array
//         i = 0;

//         System.out.println("Array elements:");

//         // Print array elements using while loop
//         while (i < arrMax.length) {
//             System.out.println(arrMax[i]);
//             i++;
//         }

//         System.out.println("<------------------->");

//         // Find the maximum number
//         int max = arrMax[0];

//         for (int j = 1; j < arrMax.length; j++) {
//             if (arrMax[j] > max) {
//                 max = arrMax[j];
//             }
//         }

//         // Print the maximum number
//         System.out.println("The Max number is: " + max);

//         sc.close();
//     }
// }



// Q4. Find the smallest number.

// Ans : - 

import java.util.Scanner;

public class arr1{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 5 numbers : ");

        int[] arrMin = new int[5];


        for(int i = 0; i < arrMin.length; i++){

            System.out.print("The Index  " +  i + "  is  = " + " ");

            arrMin[i] = in.nextInt();
        }

        System.out.println("<----------------->");

        System.out.println("The array 5 num is :");

        for(int i = 0; i < arrMin.length; i++){

            System.out.println(arrMin[i] + " ");
        }


         System.out.println("<----------------->");
         int min = arrMin[0];

         for (int j = 1; j < arrMin.length; j++) {

               if (arrMin[j] < min) {
               min = arrMin[j];
            }
        }

        System.out.println("The minimum number is: " + min);

       in.close();      

    }
}
