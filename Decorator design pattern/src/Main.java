import BaseClass.BasePizza;
import BaseClass.FarmHouse;
import BaseClass.Margherita;
import ToppingDecorator.ExtraCheese;
import ToppingDecorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new FarmHouse()));
        System.out.println(pizza.cost());
    }
}