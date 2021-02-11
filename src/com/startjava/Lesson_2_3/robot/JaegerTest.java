package com.startjava.Lesson_2_3.robot;
public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Avenger ", "red " , 260.0 , 1.980 , 7 , 8 , 6);
        Jaeger jaegerTwo = new Jaeger("Cherno Alpha" , "black" , 280.0 , 2.412 , 3 , 10 , 10);

        System.out.println(jaegerOne);
        System.out.println(jaegerTwo);
        jaegerTwo.fight();
    }
}
