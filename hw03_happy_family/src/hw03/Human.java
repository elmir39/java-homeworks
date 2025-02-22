package hw03;

import java.util.Arrays;
import java.util.Objects;

public class Human implements AutoCloseable{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year, int IQ, String[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = IQ;
        this.schedule = schedule;
        this.family = family;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getIq() { return iq; }
    public void setIq(int iq) { this.iq = iq; }

    public String[][] getSchedule() { return schedule; }
    public void setSchedule(String[][] schedule) { this.schedule = schedule; }

    public Family getFamily() { return family; }
    public void setFamily(Family family) { this.family = family; }

    public String greetPet() {
        return "Hello, " + (family.getPet() != null ? family.getPet().getNickname() : "pet");
    }

    public void describePet() {
        if (family.getPet() != null) {
            Pet pet = family.getPet();
            System.out.println("I have a " + pet.getSpecies() + ", it is " + pet.getAge() + " years old, " +
                    "he is " + (pet.getAge() > 50 ? "very sly" : "almost not sly"));
        } else {
            System.out.println("I don't have a pet.");
        }
    }

    @Override
    public String toString() {
        if (iq == 0) {
            return String.format("Human{name='%s', surname='%s', year='%d'}", name, surname, year);
        }

        String ans = "";
        if (schedule != null && schedule.length > 0) {
            for (DayOfWeek day : DayOfWeek.values()) {
                ans = ans + day.name() + ":{";
                String[] activities = schedule[day.ordinal()];
                if (activities != null && activities.length > 0) {
                    for (String activity : activities) {
                        ans = ans + activity + ",";
                    }
                    ans = ans.substring(0, ans.length() - 1);
                } else {
                    ans = ans + "No activities";
                }
                ans = ans + "} ";
            }
        } else {
            ans = "No schedule available";
        }


        return "Human{name='" + name + "', surname='" + surname + "', year=" + year +
                ", iq=" + iq + ", schedule=" + ans + "}";
    }


    @Override
    public void close() {
        System.out.println(name + " " + surname + " is closed.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return year == human.year && iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Arrays.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, Arrays.deepHashCode(schedule));
    }
}