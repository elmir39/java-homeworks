package happy_family_v4;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("John", "Doe", 1985);
        Woman woman = new Woman("Jane", "Doe", 1990);


        Family family = new Family(woman, man);
        Pet dog = new Dog("Rex");
        family.setPet(dog);
        man.setFamily(family);
        woman.setFamily(family);


        System.out.println(man.greetPet());
        System.out.println(woman.greetPet());


        man.repairCar();
        woman.makeup();


        System.out.println(family);
    }
}