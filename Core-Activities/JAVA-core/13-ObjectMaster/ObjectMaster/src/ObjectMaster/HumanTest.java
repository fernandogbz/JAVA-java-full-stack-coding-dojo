package ObjectMaster;

public class HumanTest {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();

        wizard.fireBall(ninja);
        System.out.println("wizard: " + wizard.health + " sam: " + samurai.health + " ninja: " + ninja.health);
        wizard.heal(samurai);
        System.out.println("wizard: " + wizard.health + " sam: " + samurai.health + " ninja: " + ninja.health);
        ninja.steal(samurai);
        System.out.println("wizard: " + wizard.health + " sam: " + samurai.health + " ninja: " + ninja.health);
        samurai.deathBlow(wizard);        
        System.out.println("wizard: " + wizard.health + " sam: " + samurai.health + " ninja: " + ninja.health);
    }
}
