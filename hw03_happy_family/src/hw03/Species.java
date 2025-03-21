package hw03;

public enum Species {
    DOG(false, 4, true),
    CAT(false, 4, true),
    HORSE(false, 4, true),
    RABBIT(false, 4, true),
    HAMSTER(false, 4, true),
    PARROT(true, 2, false),
    FISH(false, 0, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean canFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasFur() {
        return hasFur;
    }

    @Override
    public String toString() {
        return name() + " {canFly=" + canFly + ", numberOfLegs=" + numberOfLegs + ", hasFur=" + hasFur + "}";
    }
}
