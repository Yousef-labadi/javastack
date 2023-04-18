public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly ";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double DripCoffee =9;
        double  latte=7;
        double cappuccino= 9.5;
        double total=0;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2= "Sam";
        String customer3= "Jimmy" ;
        String customer4= "Noah" ;

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer3); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println("mocha"+pendingMessage );
        System.out.println(readyMessage);
        
        System.out.println(displayTotalMessage + DripCoffee);
        if (isReadyOrder3){
            System.out.println(generalGreeting+customer4+readyMessage + displayTotalMessage +cappuccino);

        }
        else {
            System.out.println(generalGreeting+customer4+pendingMessage );
        }
        total=latte+latte;
        System.out.println(total);
        if (isReadyOrder4){
            System.out.println(generalGreeting+customer4+readyMessage + displayTotalMessage +total);

        }
        else {
            System.out.println(generalGreeting+customer4+pendingMessage );
        }
        double total2 =0;
        total2 =latte-DripCoffee;
        if (total2 > 0){
            System.out.println("cafejava must bring to jimmy $"+total2);
        }
        else {
            System.out.println("jimmy must pay to cafejava $ "+ Math.abs(total2));
        }



    }
}
