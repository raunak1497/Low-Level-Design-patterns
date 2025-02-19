package ToppingDecorator;

import BaseClass.BasePizza;

import java.util.Scanner;

public class Mushroom extends ToppingDecorator {
    BasePizza pizza;
    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost()+20;
    }
}
