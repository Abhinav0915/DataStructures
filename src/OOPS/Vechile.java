package OOPS;

public class Vechile{
    private String brand;
    private int price;
    private String color;

    public Vechile(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }
}

class Car extends Vechile{
    private int year;

    public Car(String brand, int price, String color, int year) {
        super(brand, price, color);
        this.year = year;
    }

    public void displayYear(){
        System.out.println("Year: " + year);
    }
}

