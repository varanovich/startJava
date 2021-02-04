public class Wolf {
    private String gender = "Сучка";
    private String nickname = "Вайт";
    private int weight = 40;
    private int age = 5;
    private String color = "Серо-белый";

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
            } else {
            this.age = age;
        }
    }

    public void go() {
        System.out.println("Команда Волк бежать");
    }

    public void sit() {
        System.out.println("Команда волк сидеть");
    }

    public void run() {
        System.out.println("Команда Волку бежать");
    }

    public void howl() {
        System.out.println("Команда Волку выть");
    }

    public void hunt() {
        System.out.println("Команда Волку охитьться");
    }
 }
