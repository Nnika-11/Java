## Java

Class - every application begins with a class name -  class must match the filename and starts with capital letter

`public class MyClass` - in file MyClass.java

Object - instance of the class
- Attributes - object state, which represents its data or  characteristics
- Methods - object behavior, which defines the actions they can perform (methods can have **parameters**)
- Identity - typically managed internally by the JVM (Java Virtual Machine) and isn't directly visible to the programmer
- *Constructor* - a special method that is used to initialize objects. The constructor is called when an object of a class is created.

```
public class BoardGame {
    // Attributes
    private String name;
    private int numberOfPlayers;
    private double complexity;
    
    // Constructor
    public BoardGame(String name, int numberOfPlayers, double complexity) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.complexity = complexity;
    }
    
    //Method without parameters
    public void getGameInfo(){
        System.out.println("Game Name: "+ name + "Number of Players: " + numberOfPlayers + "complexity: " + complexity);
    }
     //Method with a parameter
     public void setComplexity(double complexity){
            this.complexity = complexity;
        }
    
     // Main method to create and display objects
    public static void main(String[] args) {
        // Creating two BoardGame objects
        BoardGame game1 = new BoardGame("Blood Rage", 4, 2.88);
        BoardGame game2 = new BoardGame("Hero Realms", 4, 1.86);
        game1.getGameInfo() //will print info
```