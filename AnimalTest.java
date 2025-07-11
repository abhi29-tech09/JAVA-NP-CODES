abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("The lion roars: Roarrrr!");
    }
}

class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("The tiger growls: Grrrrr!");
    }
}

public class AnimalTest {z
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        
        lion.sound();
        tiger.sound();
    }
}