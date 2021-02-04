public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 50;
        int myNumber = 10;
        
        while(true) {
            if(myNumber == computerNumber) {
                System.out.println("Вы угадали ");
                break;
            } else if(myNumber > computerNumber) {
                System.out.println("Вы ошиблись  " + myNumber + "  число больше");
                myNumber--;
            } else if(myNumber < computerNumber) {
                System.out.println("Вы cнова ошиблись. " + myNumber + "  число меньше ");
                myNumber++;
            }
        }
        System.out.println("Вы победили");  
    }
}