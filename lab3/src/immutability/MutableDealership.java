package immutability;

public class MutableDealership {
    Car c;

    public MutableDealership(Car c){
        this.c = c;
    }

    public void modifyCarWillModifyEveryWhere(){
        this.c.setName("MODIFIED CAR");
    }
}
