package lesson6;

public class TestLesson6 {
    public static void main(String[] args) {
        Animal animal = new Animal("Имя животного", "Цвет животного", 3);
        Cat cat = new Cat("Маркиз", "Рыжий", 2, 10);
        Dog dog = new Dog("Чип", "Рыжий", 1, 1);
        Animal animalCat = new Cat("Животное Кот", "Загадышный", 5, 2);

        animal.printInfo();
        cat.printInfo();
        dog.printInfo();
        animalCat.printInfo();
        animalCat.voice();
    }
}
