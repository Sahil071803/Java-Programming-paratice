// import java.util.Scanner;
// public class area{

//     public static void main(String[] args) {

//         float height,base,area;
//         System.out.println("Enter Base and Height  ");

//         Scanner sc = new Scanner(System.in);

//         base = sc.nextFloat();
//         height = sc.nextFloat();

//         area = 0.5f*base*height;

//         System.out.println("Area of the Triangle is " + area);

//         sc.close();

//     }
// }

import java.util.Scanner;

public class area{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        float s;
        double area;

        System.out.println("Enter 3 sides of a Trinagle ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a+b+c)/2f;

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area is " + area);


        sc.close();





    }
}