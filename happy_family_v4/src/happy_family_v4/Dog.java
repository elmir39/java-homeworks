package happy_family_v4;

public class Dog extends Pet implements Foulable{
    public Dog(String nickname) {
        super(nickname);
        this.setSpecies(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("Woof, I am " + getNickname() + " the dog.");
    }

    @Override
    public void foul() {
        System.out.println("Fouling myself!");
    }
}
