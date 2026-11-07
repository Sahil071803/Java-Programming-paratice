// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args){

//         Scanner in = new Scanner(System.in);

//         int[] arr = new int[6];

//         arr[0] = 33;

//         arr[1] = 54;

//         arr[2] = 58;

//         arr[3] = 7789;

//         arr[4] = 441;

//         arr[5] = 554;

//         System.out.print(arr[4]);

//         for(int i = 0; i < arr.length; i++){

//             arr[i] = in.nextInt();


//             System.out.print(arr[i]);


        
//         }

        
//     }
// }


// Question 1. Print Array Elements
// Create an integer array with 5 numbers and print all elements using a loop.

// Example:
// 10 20 30 40 50

// Ans : - // import java.util.Scanner;

// public class Array{

//     public static void main(String[] args){

//         Scanner in = new Scanner(System.in);

//         int[] arr = new int[5];

//         System.out.print("Enter the 5 numbers : ");

//         for(int i = 0; i < arr.length; i++){

//             arr[i] = in.nextInt();


//         }


//         for(int i = 0; i < arr.length; i++){

//             System.out.print(arr[i] + " ");

//         }


        

//         in.close();

//     }


// }



// Que 2 : - Q2. Find the Sum
// Create an array of 5 numbers and find the sum of all elements.

// Example:
// Array: 10, 20, 30, 40, 50
// Output: 150


//  ANS : = // import java.util.Scanner;

// public class Array{

//     public static void main(String[] args){

//         int[] arr = new int[5];

//         Scanner in = new Scanner(System.in);


//         System.out.println("Enter the 5 Number : ");


//         for(int i = 0; i < arr.length; i++){


//             arr[i] = in.nextInt();


//         }


//         System.out.println("Sum Of Array : ");


//         for(int i = 0; i < arr.length; i++){

//             System.out.println(arr[i] + " ");


//         }

//         int sum  = 0;

//         for(int i = 0; i< arr.length; i++){

//             sum = sum + arr[i];

//             System.out.println("Total sum of numbers = : " + sum );
//         }


//         in.close();


//     }
// }


// Question 3 : -
// Q3. Find the Largest Number
// Create an array and find the largest number.

// Example:
// Array: 10, 45, 20, 80, 30
// Output: 80


import java.util.Scanner;
public class Array{
    public static void main(String[] args){

        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the 5 Number : ");

        for(int i = 0; i < arr.length; i++){

            arr[i] = in.nextInt();
        }

        System.out.println("Array of 5 number :");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] +  " ");
        }

        int sum = 0;

        for(int i = 0; i < arr.length; i++){

            sum = sum + arr[i];

            System.out.println("The total sum = " + sum);
        }

        
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){
               max = arr[i];
            }
        }

        System.out.print("The Max no is =  :  " + max);


    }
}

