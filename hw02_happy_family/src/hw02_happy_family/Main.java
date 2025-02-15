package hw02_happy_family;

public class Main {
    public static void main(String[] args) {

        Human mother = new Human("Alice", "Wellington", 1975);
        Human father = new Human("John", "Smithson", 1982);

        Family family = new Family(mother, father);

        Pet pet = new Pet("Dog", "Charlie", 3, 8, new String[]{"sleeping", "playing"});

        family.setPet(pet);

        String[][] activities = {{"Monday", "Studying"}, {"Wednesday", "Drawing"}};

        Human child = new Human("Sophia", "Smithson", 2010, 140, activities, family);

        family.setChildren(new Human[]{child});

        System.out.println(family.toString());

        family.deleteChild(0);

        System.out.println(family.toString());
    }
}
