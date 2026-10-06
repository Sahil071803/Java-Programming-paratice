// public class Triangle {

//     public static void main(String[] args) {

//         float height = 20;

//         float base = 30;

//         float area = 1.0f / 2.0f * (base * height);

//         System.out.println(area);
//     }
// }

import java.util.Scanner;
public class Triangle{

    public static void main(String[] args) {

        float height,base,area;
        System.out.println("Enter Base and Height  ");

        Scanner sc = new Scanner(System.in);

        base = sc.nextFloat();
        height = sc.nextFloat();

        area = 0.5f*base*height;

        System.out.println("Area of the Triangle is " + area);

        sc.close();

    }
}