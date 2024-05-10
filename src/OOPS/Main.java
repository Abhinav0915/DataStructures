package OOPS;

public class Main{
    public static void main(String[] args){
        Car car = new Car("Toyoto",22000000,"Blue",2024);
        System.out.println("Car Information: ");
        car.displayInfo();
        car.displayYear();
    }
}
