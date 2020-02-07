package HW6;

import java.util.Random;

public class Cat extends Animal{
    public Cat(String name, String color, int age, int height, int weight) {
        super(name, color, age, height, weight, new Random().nextInt(150)+200, 0, new Random().nextDouble()+2);
    }
}
