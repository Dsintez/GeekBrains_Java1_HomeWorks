package HW6;

import java.util.Random;

public class Dog extends Animal {
    public Dog(String name, String color, int age, int height, int weight) {
        super(name, color, age, height, weight, new Random().nextInt(200)+400, new Random().nextInt(100)+200, new Random().nextDouble()+1);
    }
}
