public class Jaeger {
    private String modelName;
    private String color;
    private double height;
    private double weight;
    private int speed;
    private int streanght;
    private int armor;

    public Jaeger(String modelName, String color, double height, double weight, int speed, int streanght, int armor) {
        this.modelName = modelName;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.streanght = streanght;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

     public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStreanght() {
        return streanght;
    }

    public void setStreanch(int streanght) {
        this.streanght = streanght;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String toString() {
        return "Jaeger{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", speed=" + speed +
                ", streanght=" + streanght +
                ", armor=" + armor +
                '}';
    }

    public void fight() {
        System.out.println("Я всех уничтожу ");
    }
}
