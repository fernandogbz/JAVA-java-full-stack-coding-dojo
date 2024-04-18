package zoo;

public class Bat extends Mammal{
    public Bat(){
        this.energyLevel = 300;
    }

    public void fly(){
        System.out.println("*fly sound*");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("bueno, no importa");
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("*town is burning");
        this.energyLevel -= 100;
    }
}
