package lesson6;

public class Dog extends Animal {
    private int heightJump;

    public Dog(String name, String color, int age, int heightJump) {
        super(name, color, age);
        this.heightJump = heightJump;
    }

    public Dog(String name, String color, int age) {
        this(name, color, age, 0);
    }

    @Override
    public void printInfo() {
        System.out.printf("Кличка = %s; Цвет = %s; Возраст = %d; Высота прыжка = %d%n",
                getName(),
                getColor(),
                getAge(),
                getHeightJump());
    }

    @Override
    public void voice() {
        System.out.println("Собака сказал 'Гав'");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "heightJump=" + heightJump +
                '}';
    }

    public int getHeightJump() {
        return heightJump;
    }

    public void setHeightJump(int heightJump) {
        this.heightJump = heightJump;
    }
}
