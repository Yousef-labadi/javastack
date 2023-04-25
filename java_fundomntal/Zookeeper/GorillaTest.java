public class GorillaTest {
    public static void main(String[] args) {
        Mammal mammal1=new Mammal();
        System.out.println(mammal1.displayEnergy());
        Gorilla gorilla1=new Gorilla();
        System.out.println(gorilla1.displayEnergy());
        gorilla1.eatBananas();
        gorilla1.energyLevel=5;
        System.out.println(gorilla1.displayEnergy());
        gorilla1.throwSomething();
        System.out.println(gorilla1.displayEnergy());
        gorilla1.throwSomething();
        System.out.println(gorilla1.displayEnergy());
        gorilla1.climb();
        System.out.println(gorilla1.displayEnergy());

        
        
    }
}
