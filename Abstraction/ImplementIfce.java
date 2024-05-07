package Java.Abstraction;

public class ImplementIfce implements Interface {
//you can implement as many Interfaces as you want
    @Override
    public void abstractM() {
        System.out.println("Class that implements Interface should implement all classes (that are not default)");
    }

    public static void main(String[] args) {
        ImplementIfce ifce= new ImplementIfce();
        ifce.abstractM();
        ifce.defaultM();
        Interface.staticM();
//        ifce.staticM(); - not allowed
    }
}
