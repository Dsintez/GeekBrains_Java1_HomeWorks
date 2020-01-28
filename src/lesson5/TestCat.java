package lesson5;

public class TestCat {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Marciz");
        cat1.meow();

        Cat cat2 = new Cat("Zohan");
        cat2.meow();

        System.out.println(cat1 + "\n" + cat2);
    }
}
