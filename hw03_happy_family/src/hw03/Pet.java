package hw03;

import java.util.Arrays;
import java.util.Objects;

public class Pet implements AutoCloseable{
    private String nickname;
    private Species species;
    private int age;
    private int tricklevel;
    private String[] habits;

    public Pet(Species species, String nickname, int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() { }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public Species getSpecies() { return species; }
    public void setSpecies(Species species) { this.species = species; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getTricklevel() { return tricklevel; }
    public void setTricklevel(int tricklevel) { this.tricklevel = tricklevel; }

    public String[] getHabits() { return habits; }
    public void setHabits(String[] habits) { this.habits = habits; }

    @Override
    public String toString() {
        if (age == 0 && tricklevel == 0 && habits == null) {
            return String.format("Species='%s' nickname='%s'", species.name(), nickname);
        }
        return "Species='"+ species.name() + "' nickname='" + nickname + "', age=" + age +
                ", tricklevel=" + tricklevel + ", habits=" + Arrays.toString(habits) + "}";
    }

    @Override
    public void close() {
        System.out.println(species.toString() + " " + nickname + " is closed.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet pet = (Pet) obj;
        return age == pet.age &&
                tricklevel == pet.tricklevel &&
                species == pet.species &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, tricklevel);
    }
}