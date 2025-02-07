package hw01_happy_family_project;

public class Main  {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", "Masha", 2, 75, new String[]{"eat", "play", "sleep"});
        Human mother = new Human("Marie", "Curie", 1867);
        Human father = new Human("Pierre", "Curie", 1859);

        String[][] childSchedule = {{"Monday", "University"}, {"Sunday", "Football"}};
        Human child = new Human("Irene", "Curie", 1897, 200, dog, mother, father, childSchedule);

        child.greetPet();
        child.describePet();
        child.getPet().eat();
        child.getPet().respond();
        child.getPet().foul();

        System.out.println(child);
        System.out.println(dog);

        child.feedPet(false);
        child.feedPet(true);

    }
}