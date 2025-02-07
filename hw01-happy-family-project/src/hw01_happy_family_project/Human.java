package hw01_happy_family_project;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.getNickname());
        } else {
            System.out.println("I do not have a pet to greet!");
        }
    }

    public void describePet() {
        if (pet != null) {
            String slyDescribe;
            if (pet.getTrickLevel() > 50) {
                slyDescribe = "very sly";
            } else {
                slyDescribe = "almost not sly";
            }
            System.out.println("I have a " + pet.getSpecies() + " which is " + pet.getAge() + " years old, it is " + slyDescribe);
        } else {
            System.out.println("I don't have a pet to describe!");
        }
    }

    public void feedPet(boolean isTime) {
        if (pet == null) {
            System.out.println("I don't have a pet to feed.");
            return;
        }
        if (isTime) {
            System.out.printf("Hm... I will feed %s's %s%n", name, pet.getNickname());
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(101);
            if (pet.getTrickLevel() > randomValue) {
                System.out.printf("Hm... I will feed %s's %s%n", name, pet.getNickname());
            } else {
                System.out.printf("I think %s is not hungry.%n", pet.getNickname());
            }
        }
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getYear() { return year; }
    public int getIq() { return iq; }
    public Pet getPet() { return pet; }
    public Human getMother() { return mother; }
    public Human getFather() { return father; }
    public String[][] getSchedule() { return schedule; }

    @Override
    public String toString() {
        String motherStr = (mother != null) ? mother.name + " " + mother.surname : "Unknown";
        String fatherStr = (father != null) ? father.name + " " + father.surname : "Unknown";
        String petStr = (pet != null) ? pet.toString() : "Unknown";

        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, mother=%s, father=%s, pet=%s}",
                name, surname, year, iq, motherStr, fatherStr, petStr);
    }
}