package hw01_happy_family_project;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating...");
    }

    public void respond() {
        System.out.println("Hello owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up.");
    }

    //getters
    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    @Override
    public String toString() {
        String habitsStr = "[";
        for (int i = 0; i < habits.length; i++) {
            habitsStr += habits[i];
            if (i < habits.length - 1) {
                habitsStr += ", ";
            }
        }
        habitsStr += "]";
        return species + "{nickname= '" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + habitsStr + "}";
    }


}