package happy_family_v4;

public class Fish extends Pet{
    public Fish(String nickname) {
        super(nickname);
        this.setSpecies(Species.FISH);
    }

    @Override
    public void respond() {
        System.out.println("Blub blub, I am " + getNickname() + " the fish.");
    }
}
