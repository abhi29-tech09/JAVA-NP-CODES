abstract class animal{
    abstract void sound();
}
class Lion extends animal{
    @Override
    void sound(){
       System.out.println("Growling....");
    }
}
class Liger extends animal{
    @Override
    void sound(){
       System.out.println("laoud Roar....");
    }
}
public class animalSounds {
  public static void main(String[] args) {
    Lion l1 = new Lion();
    Liger t1 = new Liger();
    l1.sound();
    t1.sound();;
  }
}
