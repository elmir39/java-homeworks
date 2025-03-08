package happy_family_v4;

import java.util.Arrays;
import java.util.Objects;

public class Family implements AutoCloseable{
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = null;
    }

    public Human getMother() { return mother; }
    public void setMother(Human mother) { this.mother = mother; }

    public Human getFather() { return father; }
    public void setFather(Human father) { this.father = father; }

    public Human[] getChildren() { return children; }
    public void setChildren(Human[] children) { this.children = children; }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        children = newChildren;
        child.setFamily(this);
    }

    public void deleteChild(Human child) {

        if (child == null) {
            System.out.println("Child is null, cannot be deleted.");
        }

        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Child is not in this family.");
            return;
        }

        Human[] newChildren = new Human[children.length - 1];
        System.arraycopy(children, 0, newChildren, 0, index);

        if (index < children.length - 1) {
            System.arraycopy(children, index + 1, newChildren, index, children.length - index - 1);
        }
        children = newChildren;
        System.out.println("Child " + child.getName() + " has been removed from the family.");
        child.setFamily(null);
    }

    public int countFamily() {
        int count = 2 + children.length;  // 2 for mother and father
        if (pet != null) {
            count++;  // Add 1 for the pet if it exists
        }
        return count;
    }


    @Override
    public String toString() {

        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + (pet != null ? pet.toString() : "No pet") +
                '}';
    }

    @Override
    public void close() {
        System.out.println(toString() + " is closed");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Family family = (Family) obj;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pet);
    }
}