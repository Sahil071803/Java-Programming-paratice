
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operator (+, -, *, /, %, x to exit): ");
            char op = sc.next().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Calculator closed.");
                break;
            }

            if (op == '+' || op == '-' || op == '*' ||
                op == '/' || op == '%') {

                System.out.println("<---My Calculator--->");

                System.out.print("Enter the number-1: ");
                int num1 = sc.nextInt();

                System.out.print("Enter the number-2: ");
                int num2 = sc.nextInt();

                int ans = 0;

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    ans = num1 / num2;
                } else if (op == '%') {
                    if (num2 == 0) {
                        System.out.println("Cannot use modulo with zero!");
                        continue;
                    }
                    ans = num1 % num2;
                }

                System.out.println("Answer: " + ans);

            } else {
                System.out.println("Invalid Operation!");
            }
        }

        sc.close();
    }
}
