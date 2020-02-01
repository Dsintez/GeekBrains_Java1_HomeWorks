package lesson6;

public class Cat extends Animal {

    private int weight;

    public Cat(String name, String color, int age, int weight) {
        super(name, color, age);
        this.weight = weight;
    }

    public Cat(String name, String color, int age) {
        this(name, color, age, 0);
    }

    @Override
    public void printInfo() {
        System.out.printf("Кличка = %s; Цвет = %s; Возраст = %d; Вес = %d%n",
                getName(),
                getColor(),
                getAge(),
                getWeight());
    }

    @Override
    public void voice() {
        System.out.println("Кот сказал 'Мяу'");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
