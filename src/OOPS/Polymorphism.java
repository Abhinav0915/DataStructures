package OOPS;

class Animal{
    public void makeSound(){
        System.out.println("Animal Makes a sound!");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }
}


public class Polymorphism {

}
