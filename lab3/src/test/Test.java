package test;

import animal.Animal;
import animal.Ape;
import animal.Bird;
import animal.Duck;
import immutability.Car;
import immutability.Dealership;
import immutability.MutableDealership;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("aro", 6);
        animal.eat("tomatoes");

        Ape ape = new Ape("let", 2, 2);

        Car c = new Car("BMW");
        Dealership d = new Dealership(c);
        d.modifyCarWillNotModifyEveryWhere();
        c.showName();
        MutableDealership md = new MutableDealership(c);
        md.modifyCarWillModifyEveryWhere();
        c.showName();
    }
}
