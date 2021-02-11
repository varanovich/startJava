package com.startjava.Lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String answer;
        
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int numberOne = scanner.nextInt();
            System.out.print("Введите математический знак: ");
            char sign = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            int numberTwo = scanner.nextInt();
            calculator.calculate(numberOne, numberTwo, sign);
            do {
                answer = "да";
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
            } while(!answer.equals("да")  && !answer.equals("нет"));
        }while (!answer.equals("нет"));
        System.out.println("Калькулятор закрылся");
    }

}
