public class Main {
    public static void main(String[] args) {

        Rabbit bunny = new Rabbit("Bugs", 2, "White", 3.5);

        System.out.println(bunny);

        // Test methods
        bunny.eat();
        bunny.hop(5);
        bunny.sleep();
        bunny.eat();
        bunny.eat();
        bunny.hop(15);
    }
}