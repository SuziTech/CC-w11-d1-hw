import java.util.Scanner;
import java.math.*;

public class Calculator<operation> {
    private static final Scanner askScanner = new Scanner(System.in);
    public static double answer;
    public static double firstNumber;
    public static double secondNumber;

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {

        System.out.println("Calculator");
        System.out.println("Enter One of: +, -, *, /");
        String operation = askScanner.nextLine();
    }

    switch(operation)

    {
        case "+":
            addition();
            break;
        case "-":
            subtraction();
            break;
        case "*":
            multiplication();
            break;
        case "/":
            division();
            break;
        default:
            System.out.println("Please select: +, -, * or /");
            calculator();
    }
    askScanner.close();

    public static class numbers {
        double firstNumber;
        double secondNumber;
    }

    private static double getNumbers() {
        System.out.println("Enter the first number: ");
        firstNumber = askScanner.nextDouble();
        System.out.println("Enter the second number: ");
        secondNumber = askScanner.nextDouble();
        numberSet = new.numbers(firstNumber, secondNumber);
        return numberSet;
    }

}