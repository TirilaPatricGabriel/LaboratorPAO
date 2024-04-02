package immutability;

public class Car {
    String name;

    public Car(){
        this.name = "DefaultCar";
    }

    public Car(String name){
        this.name = name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void showName(){
        System.out.println(this.name);
    }
}
