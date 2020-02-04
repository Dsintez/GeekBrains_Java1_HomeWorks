package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Plate plate){
        if (plate.decreaseFood(appetite)) {
            satiety = true;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
