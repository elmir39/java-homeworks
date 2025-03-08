package happy_family_v4;

public class RoboCat extends Pet{

    public RoboCat(String nickname) {
        super(nickname);
        this.setSpecies(Species.UNKNOWN);
    }

    @Override
    public void respond() {
        System.out.println("I am a RoboCat. Beep beep.");
    }
}
