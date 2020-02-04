package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    public void increaseFood(int piece){
        if (piece < 0) return;
        food = food + piece;
    }

    public boolean decreaseFood(int piece){
        if (food - piece < 0) return false;
        food = food - piece;
        return true;
    }

    public int getFood() {
        return food;
    }
}
