package immutability;

public class Dealership {
    Car c;

    public Dealership(Car c){
        Car c2 = new Car();
        c2.setName("Lexus");
        this.c = c2;
    }

    public void modifyCarWillNotModifyEveryWhere(){
        this.c.setName("MODIFIED CAR");
    }
}
