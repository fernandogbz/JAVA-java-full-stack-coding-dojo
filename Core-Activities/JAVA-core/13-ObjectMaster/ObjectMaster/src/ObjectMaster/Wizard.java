package ObjectMaster;

public class Wizard extends Human{
    public Wizard(){
        super();
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human target){
        target.health += this.intelligence;
    }

    public void fireBall(Human target){
        target.health -= this.intelligence * 3;
    }
}
