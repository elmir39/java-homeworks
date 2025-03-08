package happy_family_v4;

public class DomesticCat extends Pet implements Foulable{
    public DomesticCat(String nickname) {
        super(nickname);
        this.setSpecies(Species.CAT);
    }

    @Override
    public void respond() {
        System.out.println("Meow! I am " + getNickname() + " your domestic cat.");
    }

    @Override
    public void foul() {
        System.out.println("Fouling myself!");
    }
}
