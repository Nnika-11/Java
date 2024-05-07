package Java.Abstraction;

public abstract class Abstraction {
    static int counter=1;
    Abstraction() {
        System.out.println("Abstract class can have constructors");
    }

    public void regularM() {
        System.out.println("Abstract class can have regular methods");
    }

    public static void staticM() {

        System.out.println("Abstract class can have static methods "+counter++);

    }
    public void superM() {

        System.out.println("Abstract method can be called with super");

    }

    public abstract void abstractM();


    //"Abstract class can't have implementation - body"
    //cant be private
    //should be present in sub-classes
    //only in abstract class
}
