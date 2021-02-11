package com.startjava.Lesson_1.app;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 33;
        if (age > 20){
            System.out.println("Вы уже старик");
        }

        boolean gender = true;
        if(gender) {
            System.out.println("если мужской пол вам повезло");
        } 

        if(!gender) {
            System.out.println("если женский вам не повезло");
        }
        
        double growth = 175.0;
        if (growth < 1.80){
            System.out.println("ВЫ карлик ");
        } else {
            System.out.println("ВЫ высокий ");
        }

        char firstLetterOfName = 'M';
        if (firstLetterOfName == 'M') {
            System.out.println ("Имя начинается на букву М   ");
        } else if (firstLetterOfName == 'I') {
            System.out.println ("Имя начинается на букву I   ");
        } else {
            System.out.println ("Имя начинается на другую юукву   ");
        }
    }
}