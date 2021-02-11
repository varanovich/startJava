package com.startjava.Lesson_2_3.game;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int computerNumber;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void game() {
        computerNumber = randomNumber();
        System.out.println("Компьютер загадал число: - " + computerNumber);

        while (true) {
            System.out.print("Игрок 1, введите ваше число: ");
            playerOne.setNumber(scanner.nextInt());

            System.out.print("Игрок 2, введите ваше число: ");
            playerTwo.setNumber(scanner.nextInt());
            if (checkNumber(playerOne)) {
               break;
            }
            if (checkNumber(playerTwo)) {
                break;
            }

        }
    }

    public int  randomNumber() {
        return (random.nextInt(101) + 1);
    }

    public boolean checkNumber(Player player) {
        if(computerNumber == player.getNumber()) {
            System.out.println("Вы угдали,поздавялю, вы выиграли!!! - " + player.getName() + player.getName());
            return true;
        } else {
                System.out.println("Вы не угадали, побробуйте в другой раз - " + player.getName() + player.getName());
                return false;
            }
        }
    }



