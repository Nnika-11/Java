## Abstraction

Abstraction - hiding details (complexity), show functionality. (must be inherited from another class)

<b>Abstract class</b> <br>
<code  style="background-color:#99ffcc; color:black; padding: 5px">abstract</code>
<code style="background-color:#99ffcc; color:black; padding: 5px">extends</code>
1) Can't be instantiated 
2) can nave constructors, static methods, regular methods

<b>Abstract method</b>
1) Doesn't have implementation (no body)
2) Can't be private
3) All subclasses of abstract superclass should implement all abstract methods or be abstract
4) if class has abstract method it is an abstract class
<details>
  <summary> <b> Example </b> </summary><br>

```
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}
```
</details>

<b>Interface</b><br>
<span style="background-color:#99ffcc; color:black; padding: 5px">interface</span>
<span style="background-color:#99ffcc; color:black; padding: 5px">implements</span>