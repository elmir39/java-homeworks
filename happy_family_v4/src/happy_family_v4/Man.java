package happy_family_v4;

public final class Man extends Human{
    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public String greetPet() {
        return "Hey buddy! It's me, your owner " + getName();
    }

    public void repairCar() {
        System.out.println(getName() + " is fixing the car!");
    }

}
