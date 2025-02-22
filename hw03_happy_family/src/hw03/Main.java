package hw03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i < 1_000_000) {
            try (Human human = new Human("name" + i, "surname" + i, i)){

                System.out.println(human.toString());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            if (i % 100_000 == 0) {
                System.gc();
            }
            i++;
        }
        try (Human mother = new Human("Alice", "Wellington", 1975);
             Human father = new Human("John", "Smithson", 1982);
             Family family = new Family(mother, father);
             Pet pet = new Pet(Species.PARROT, "Lily", 2, 45, new String[]{"eating", "sleeping"})){
            family.setPet(pet);
            System.out.println(mother.toString());
            System.out.println(father.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        Human person = new Human("Hisdraw", "Rickfold", 2001, 120,
                new String[][]{
                        {"study", "walk"},
                        {"sleep", "work"},
                        {},
                        {},
                        {},
                        {},
                        {}
                },null);
        System.out.println(person.toString());
        person.getSchedule()[hw03.DayOfWeek.FRIDAY.ordinal()] = new String[]{"study", "jogging"};
        System.out.println(person.toString());

        System.out.println();
        Human mother = new Human("Mother", "Test", 1980, 120, new String[][]{}, null);
        Human father = new Human("Father", "Test", 1980, 120, new String[][]{}, null);
        Family family = new Family(mother, father);
        Human child1 = new Human("Child1", "Test", 2010, 100, new String[][]{}, family);
        Human child2 = new Human("Child2", "Test", 2012, 100, new String[][]{}, family);
        family.addChild(child1);
        family.addChild(child2);


        System.out.println(Arrays.toString(family.getChildren()));
        family.deleteChild(child1);
        System.out.println(Arrays.toString(family.getChildren()));



        Human nonExistentChild = new Human("NonExistent", "Test", 2020, 100, new String[][]{}, family);
        family.deleteChild(nonExistentChild);
        System.out.println(Arrays.toString(family.getChildren()));


        family.addChild(child1);
        System.out.println(Arrays.toString(family.getChildren()));
        System.out.println(family.countFamily());

        Pet doggo = new Pet(Species.DOG, "Troppy");
        family.setPet(doggo);
        System.out.println(family.countFamily());
        System.out.println(family.toString());

        System.out.println(doggo.getSpecies().toString());

    }
}