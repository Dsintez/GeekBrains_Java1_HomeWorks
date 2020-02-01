package HW6;

public class Animal {

    private String name;
    private String color;
    private int age;

    private int height;
    private int weight;

    private int maxRangeRun;
    private int maxRangeSwim;
    private double maxHeightJump;

    public boolean run(int range) {
        System.out.println("run: " + (range < maxRangeRun));
        return range < maxRangeRun;
    }

    public boolean swim(int range) {
        System.out.println("swim: " + (range < maxRangeSwim));
        return range < maxRangeSwim;
    }

    public boolean jump(double height) {
        System.out.println("jump: " + (height < maxHeightJump));
        return height < maxHeightJump;
    }

    public Animal(String name, String color, int age, int height, int weight, int maxRangeRun, int maxRangeSwim, double maxHeightJump) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.maxRangeRun = maxRangeRun;
        this.maxRangeSwim = maxRangeSwim;
        this.maxHeightJump = maxHeightJump;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxRangeRun() {
        return maxRangeRun;
    }

    public int getMaxRangeSwim() {
        return maxRangeSwim;
    }

    public double getMaxHeightJump() {
        return maxHeightJump;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
