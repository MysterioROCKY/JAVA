class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void makeSound(String sound) {
        System.out.println("Dog makes a specific sound: " + sound);
    }
}

public class TypeConv {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound(); 

        Dog myDog = (Dog) myAnimal;
        myDog.makeSound(); 

        myDog.makeSound("Woof");

        Dog anotherDog = new Dog();
        anotherDog.makeSound("Bark");
    }
}
