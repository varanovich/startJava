public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
       
        char sign = '+';

        if(sign == '+' ) {
                System.out.println(a + b);
            } else if (sign == '-') {
                System.out.println (a - b);
            } else if (sign == '*') {
                System.out.println(a * b);
            } else if (sign == '/') {
                System.out.println(a / b);
            } else if (sign == '%') {
                System.out.println(a % b);
            } else if (sign == '^') {
            if (b == 0) {
                System.out.println(1);
            }
                int result = 1;
                for(int i = 0; i < b; i++) {
                result *= a;
            }
            System.out.println(result);
        }
    }
}

