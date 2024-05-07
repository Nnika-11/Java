package Java.Abstraction;

public class ExtendAbs extends Abstraction {

    ExtendAbs(){
        System.out.println("Call a child constructor");
    }
    ExtendAbs(String a){
        System.out.println("Call a overloaded child constructor with a String "+a);
    }
    @Override
    public void regularM() {
        System.out.println("Normal class override regular method of abs");
    }
//    public void regularM(int i) {
//        super.regularM();
//    }
    @Override
    public void abstractM() {
        System.out.println("All sub-classes of abstract class should implement all abstract methods");
    }
    public void superM(int i) {
        System.out.println("created childes method that calls super method");
        super.superM();
    }


    public static void main(String[] args) {

        Abstraction abs = new ExtendAbs(); //will call abstr constructor + childs
        System.out.println("----------------------------");
        Abstraction abs2 = new ExtendAbs("myString"); //still call abstr constructor + childs
        System.out.println("----------------------------");
        ExtendAbs abs3 = new ExtendAbs(); //still call abstr constructor + child
        System.out.println("----------------------------");
        System.out.println("-------------METHODS---------------");
        abs.regularM();
        System.out.println("----------------------------");
        abs3.superM(2);
        System.out.println("----------------------------");
        abs.abstractM();
        System.out.println("----------------------------");
        staticM();
        abs3.staticM();
    }
}
