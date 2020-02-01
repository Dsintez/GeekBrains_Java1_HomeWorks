package lesson6;

public class Animal {

    protected String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printInfo(){
        System.out.printf("Кличка = %s; Цвет = %s; Возраст = %d%n",
                getName(),
                getColor(),
                getAge());
    }

    public void voice(){
        System.out.println("Животное издало звук");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
