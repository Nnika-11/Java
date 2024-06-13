## Abstraction

Abstraction - hiding details (complexity), show functionality. (must be inherited from another class)

<b>Abstract class</b> <br>
<code  style="background-color:#99ffcc; color:black; padding: 5px">abstract</code>
<code style="background-color:#99ffcc; color:black; padding: 5px">extends</code>
1) Can't be instantiated 
2) Can nave constructors, static methods, regular methods

<b>Abstract method</b>
1) Doesn't have implementation (no body)
2) Can't be private
3) All subclasses of abstract superclass should implement all abstract methods or be abstract
4) If class has abstract method it is an abstract class
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
<code style="background-color:#99ffcc; color:black; padding: 5px">interface</code>
<code style="background-color:#99ffcc; color:black; padding: 5px">implements</code>
1. Multi inheritance
2. All methods are abstract and public by default
3. All variables are public, static, final
4. Can have `default` method with realisation (body)


[Abstraction Examples](https://github.com/Nnika-11/Java/tree/master/Abstraction)


## Encapsulation

Encapsulation - process of wrapping code and data together into a single unit - class. In encapsulation, 
a class's variables are hidden from other classes and can only be accessed
by the methods of the class in which they are found.

![](https://cdn-images-1.medium.com/max/1032/1*LxzenIa4d1QuPw1bWjzbGA.png)

- access modifiers
- getters and setters


<b>Access Modifiers</b>

|  | Class | Package | Subclass, Outside Package | Non-Subclass, Outside Package |
|-------------|:-----:|:-------:|:-------------------------:|:-----------------------------:|
| `Private`   | **Y** |    N    |             N             |               N               |
| `Default`   |   **Y**   |    **Y**    |             N             |               N               |
| `Protected` |   **Y**  |    **Y**    |            **Y**             |               N               |
| `Public`    |   **Y**  |   **Y**   |             **Y**            |              **Y**               |

Package - group of similar types of classes, interfaces, sub-packages etc. 

<b>Non-Access Modifiers</b> <br>
`static` \
static class - can be only inside the other class (nested).  
Static class can access only the static members of the outer class.

A good use of a static class is in defining one-off, utility and/or library classes where instantiation would not make sense. A great example is the Math class that contains some mathematical constants such as PI and E and simply provides mathematical calculations. Requiring instantiation in such a case would be unnecessary and confusing.