import java.util.Scanner;

public class calculator {


    private static int calculate (String sign, int number, int number2) {


        if (sign.equals("+")) {
            return number + number2;
        } else if (sign.equals("-")) {
            return number - number2;
        } else if (sign.equals("*")) {
            return number * number2;
        } else if (sign.equals("/")) {
            return number / number2;
        } else if (sign.equals("%")) {
            return number % number2;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {

        System.out.println("operation number number");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();

        String[] parts = user.split(" ");

        int number = Integer.parseInt(parts[1]);
        int number2 = Integer.parseInt(parts[2]);

        System.out.println(calculate(parts[0], number, number2));







        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
    }
}
