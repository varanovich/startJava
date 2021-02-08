package Сalculator;

public class Calculator {
    public void calculate(int numberOne, int numberTwo, char sign) {
        switch(sign) {
            case '+' :
                System.out.println(numberOne + numberTwo);
                break;
            case '-' :
                System.out.println(numberOne - numberTwo);
                break;
            case '*' :
                System.out.println(numberOne * numberTwo);
                break;
            case '/' :
                System.out.println(numberOne / numberTwo);
                break;
            case '%' :
                System.out.println(numberOne % numberTwo);
                break;
            case '^' :
                if (numberTwo == 0) {
                    System.out.println(1);
                }
                int result = 1;
                for(int i = 0; i < numberTwo; i++) {
                    result *= numberOne;
                }
                System.out.println(result);
                break;
            default:
                System.out.println("Недопустимый символ");
        }
    }
}
