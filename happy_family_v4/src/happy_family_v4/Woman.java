package happy_family_v4;

public final class Woman extends Human {
    public Woman (String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public String greetPet() {
        return "Hello, my sweet pet. I am " + getName();
    }

    public void makeup() {
        System.out.println(getName() + " is making up!");
    }
}
