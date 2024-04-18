package ObjectMaster;

public class Samurai extends Human{
    public Samurai(){
        super();
        this.health = 200;
    }

    public void deathBlow(Human target){
        target.health = 0;
        this.health /= 2;
    }

    public void meditate(){
        this.health *= 2;
    }

    public int howMany(){
        return this.health;
    }
}
