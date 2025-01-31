public class Rabbit {
    private String name;
    private int age;
    private String color;
    private double weight;
    private boolean isHungry;

    public Rabbit (String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.isHungry = true;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public boolean isHungry() { return isHungry; }
    public void setHungry(boolean isHungry) { this.isHungry = isHungry; }

    public void eat() {
        if (isHungry) {
            System.out.println(name + " is eating...");
            isHungry = false;
        } else {
            System.out.println(name + " is not hungry!");
        }
    }

    public void hop (int distance) {
        System.out.println(name + " is hopping " + distance + " meters...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
        isHungry = true;
    }

    @Override
    public String toString() {
        return "Rabbit [name=" + name + ", age=" + age + ", color=" + color + ", weight=" + weight + ", isHungry=" + isHungry + "]";
    }

}