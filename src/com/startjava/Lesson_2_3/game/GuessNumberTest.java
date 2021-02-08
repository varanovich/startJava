import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра запущена!!! ");

        System.out.print("Игрок 1, введите ваше имя: ");
        Player playerOne = new Player(scanner.nextLine());

        System.out.print("Игрок 2, введите ваше имя: ");
        Player playerTwo = new Player(scanner.nextLine());

        GuessNumber guessNumber = new GuessNumber(playerOne , playerTwo);

        String answer = "да";
        while(answer.equals("да")) {
            guessNumber.game();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
        System.out.println("Конец игры, всего доброго");
    }
}