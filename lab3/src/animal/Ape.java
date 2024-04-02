package animal;

public class Ape extends Animal{
    private int size;
    public Ape(String name, int noOfLegs, int size){
        super(name, noOfLegs);
        this.size = size;
    }
    public void move(){
        System.out.println("move from ape");
    }
}
