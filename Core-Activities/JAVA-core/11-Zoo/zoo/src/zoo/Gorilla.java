package zoo;

public class Gorilla extends Mammal{

    public Gorilla() {
        super();
    }

    public void throwSomething() {
        System.out.println("Gorilla threw something");
        this.energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla is satisfied");
        this.energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla climbed a tree");
        this.energyLevel -= 10;
    }
}
