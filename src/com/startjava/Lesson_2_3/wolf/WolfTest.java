public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println(wolfOne.getGender());
        System.out.println(wolfOne.getNickname());
        wolfOne.setAge(3);
        System.out.println("Возраст 1 - " + wolfOne.getAge());
        wolfOne.setAge(10);
        System.out.println("Возраст 2 - " + wolfOne.getAge());
    }
}