package animal;

import java.util.Objects;

public class Animal {
    private String name;
    private int noOfLegs;
    public Animal(){
        this.name = "animal_name";
        this.noOfLegs = 4;
    }
    public Animal(String name, int noOfLegs){
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public void move(){
        System.out.println("move");
    }
    public void eat(){
        System.out.println("eat");
    }
    public void eat(String food){
        System.out.println("eat " + food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return noOfLegs == animal.noOfLegs && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, noOfLegs);
    }
}
