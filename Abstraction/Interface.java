package Java.Abstraction;

interface Interface {
    String a = "All var in interface are public, static and final by default";
    int counter = 0;

    void abstractM();
    //usually all methods in interface are abstract - by default they abstract and public

    default void defaultM() {
        System.out.println("Default methods are allowed in interfaces (from java8) and can have body, but better not to use");
    }

    static void staticM() {
//        counter++; -we cannot change it!
        System.out.println("Static methods are allowed in interfaces and can be called only through calling Interface itself");
    }
}

