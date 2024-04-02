package test;

import immutability.Car;
import immutability.Dealership;
import immutability.MutableDealership;

public class TestMyMutability {
    public static void main(String[] args) {

        Car c = new Car("BMW");
        Dealership d = new Dealership(c);
        d.modifyCarWillNotModifyEveryWhere();
        c.showName();
        MutableDealership md = new MutableDealership(c);
        md.modifyCarWillModifyEveryWhere();
        c.showName();
    }
}
