package Day8;

interface Flyable{
    void fly();
}

class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird flies with wing");
    }
}

class Aeroplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Aeroplane flies with fuel");
    }
}


public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyableObject = {new Bird(), new Aeroplane()};
        for (Flyable flyable: flyableObject){
            flyable.fly();
        }
    }
}
