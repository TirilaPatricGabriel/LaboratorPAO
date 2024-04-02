package animal;

import java.util.Objects;

public class Duck extends Bird{
    private int length;
    public Duck(String name, int noOfLegs, String color, int length){
        super(name, noOfLegs, color);
        this.length = length;
    }

    public void move(){
        System.out.println("move from duck");
    }

    public void sing(){
        System.out.println("sing from duck");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return length == duck.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length);
    }
}
