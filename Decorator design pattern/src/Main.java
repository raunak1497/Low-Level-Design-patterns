import BaseClass.BasePizza;
import BaseClass.FarmHouse;
import BaseClass.Margherita;
import BaseClass.VegDelight;
import ToppingDecorator.ExtraCheese;
import ToppingDecorator.Mushroom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       BasePizza pizza1 = new ExtraCheese(new Margherita());
       BasePizza pizza2 = new Mushroom(new VegDelight());
       System.out.println(pizza1.cost());
       System.out.println(pizza2.cost());
        BasePizza myPizza = null;
        Scanner scanner = new Scanner(System.in);
        char exit = 'a';

        while(exit != 'q'){
            System.out.println("Press 1 for Margherita");
            System.out.println("Press 2 for Veg Delight");
            System.out.println("Press 3 for Farmhouse");
            System.out.println("Press 0 to move to toppings");
            exit = scanner.next().charAt(0);
            switch (exit){
                case '1' : {
                    myPizza = new Margherita();
                    break;
                }
                case '2' : {
                    myPizza = new VegDelight();
                    break;
                }
                case '3' : {
                    myPizza = new FarmHouse();
                    break;
                }
                default: {
                    exit = 'q';
                }
            }
        }

        char topping = 'a';

        while(topping != 'q'){
            System.out.println("Press 1 for Mushroom");
            System.out.println("Press 2 for ExtraCheese");
            System.out.println("Press 0 to move to checkout");
            topping = scanner.next().charAt(0);
            switch(topping) {
                case '1' : {
                    myPizza = new Mushroom(myPizza);
                    break;
                }
                case '2' : {
                    myPizza = new ExtraCheese(myPizza);
                    break;
                }
                default: {
                    topping = 'q';
                    break;
                }
            }
        }

        System.out.println("Your total cost is : " + myPizza.cost());
    }
}