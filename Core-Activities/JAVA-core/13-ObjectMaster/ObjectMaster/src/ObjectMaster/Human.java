package ObjectMaster;

public class Human {
    public int health;
    public int strength;
    public int stealth;
    public int intelligence;

    public Human(){
        this.health = 100;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
    }

    public void attack(Human target){
        target.health -= 10;
    }
}