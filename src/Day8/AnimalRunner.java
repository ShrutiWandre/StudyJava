package Day8;

abstract class AbstractAnimal{
    abstract void sound();
}

class Dog extends AbstractAnimal{
    @Override
    void sound() {
        System.out.println("Dog sound: Bow Bow");
    }
}

class Cat extends AbstractAnimal{
    @Override
    void sound() {
        System.out.println("Cat sound: Meow Meow");
    }
}

public class AnimalRunner {
    public static void main(String[] args) {
        AbstractAnimal[] abstractAnimals = {new Dog(),new Cat()};
        for (AbstractAnimal abstractAnimal:abstractAnimals){
            abstractAnimal.sound();
        }
    }
}
