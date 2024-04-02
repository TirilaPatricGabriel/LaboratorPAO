package animal;

import java.util.Objects;

public class Bird extends Animal{
    private String color;
    public Bird(String name, int noOfLegs, String color){
        super(name, noOfLegs);
        this.color = color;
    }

    public void sing(){
        System.out.println("sing from bird");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(color, bird.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
