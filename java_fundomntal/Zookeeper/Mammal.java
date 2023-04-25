public class Mammal {
    protected int energyLevel;
    public Mammal(){
        System.out.println("you start with energy :");
    this.energyLevel=100;
    }
    public int displayEnergy() {
        
        return this.energyLevel;
    }
    
}