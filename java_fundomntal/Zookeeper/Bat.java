public class Bat extends Mammal{

    public Bat() {
        energyLevel = 300;
    }
    public void fly(){
        System.out.println("the sound of a bat taking off..");
        this.energyLevel-=50;
    }
    public void eatHumans(){
        System.out.println("so- well, never mind..");
        this.energyLevel+=25;

    }
    public void attackTown() {
        System.out.println("Sound of a town on fire...");
        energyLevel -= 100;
    }

    
}
