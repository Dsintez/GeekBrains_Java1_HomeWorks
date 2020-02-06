package HW6;

import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        Animal[] animals = new Animal[size];
        for (int i = 0; i < size; i++) {
            int go = random.nextInt(2);
            switch (go){
                case 0:
                    animals[i] = new Cat(("Name " + (char) (random.nextInt(40) + 30)), "Белый", random.nextInt(5) + 1, 2, 2);
                    break;
                case 1:
                    animals[i] = new Dog(("Name " + (char) (random.nextInt(40) + 30)), "Белый", random.nextInt(5) + 1, 2, 2);
                    break;
            }
        }
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.jump(1.5);
            animal.run(200);
            animal.swim(200);
            System.out.println(animal.getMaxHeightJump() + "\n" +
                    animal.getMaxRangeRun() + "\n" +
                    animal.getMaxRangeSwim());
            System.out.println("-----");
        }
    }
}
