// import java.util.ArrayList;
public class TextOrder{
    public static void main(String[] args) {
        Item item1=new Item();
        item1.name="mocha";
        item1.price=5;
        Item item2=new Item();
        item2.name="latte";
        item2.price=7.5;
        Item item3=new Item();
        item3.name="drip coffee";
        item3.price=6.5;
        Item item4=new Item();
        item4.name="capuccino";
        item4.price=3;
        Order order1=new Order();
        Order order2=new Order();
        Order order3=new Order();
        Order order4=new Order();
        order1.name="Cindhuri";
        order2.name="Jimmy";
        order3.name="Noah";
        order4.name="Sam";
        order2.item.add(item1);
        order2.total+=item1.price;
        order3.item.add(item4);
        order3.total+=item4.price;
        order4.item.add(item2);
        order4.total+=item2.price;
        order1.item.add(item3);
        order1.total+=item3.price;
        order1.ready=true;
        order4.item.add(item2);
        order4.item.add(item2);
        order4.total+= 2*item2.price;
        order2.ready=true;


        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        }
}
        
