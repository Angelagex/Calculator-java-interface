package Calculator;

import java.util.Scanner;
import java.util.function.Predicate;

public class Calculator {

    //Input
    static Scanner entrada = new Scanner(System.in);
    static Double number1, number2;

    //Operations
    static Predicate<Double> isZero = (num) -> num==0;

    static IOperation Sum = (num1, num2) -> num1 + num2;

    static IOperation Substract = (num1, num2) -> num1 - num2;

    static IOperation Multiply = (num1, num2) -> num1 * num2;

    static IOperation Divide = (num1, num2) -> num1 / num2;

    static void printResult(Double num1, Double num2){
        System.out.println("\nSum is: " + Sum.calculate(num1, num2) +
                "\nSubstract is: " + Substract.calculate(num1, num2) +
                "\nMultiply is: " + Multiply.calculate(num1, num2) +
                "\nDivide is: " + (isZero.test(num1)||isZero.test(num2)
                                ? "not possible"
                                : Divide.calculate(num1, num2)));
    }



    //Application
    public static void main(String[] args) {

        System.out.println("Welcome to Calculator, please give to me 2 numbers");
        number1 = entrada.nextDouble();
        number2 = entrada.nextDouble();
        printResult(number1, number2);
    }

}
