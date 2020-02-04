package lesson7;

public class CatShelter {
    public static void main(String[] args) {
        int numberOfCats = 10;
        Cat[] cats = new Cat[numberOfCats];
        Plate plate = new Plate(100);

        plate.info();
        for (int i = 0; i < numberOfCats; i++) {
            cats[i] = new Cat("Cat" + (i + 1), 11 + i);
            cats[i].eat(plate);
            System.out.println(cats[i]);
        }
        plate.info();
    }
}
