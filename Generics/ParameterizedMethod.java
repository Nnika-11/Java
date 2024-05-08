package Java.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParameterizedMethod {
    //methods with Generics in params


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(-2,-1,1,2,3,4,5,6,7));
        int secondEl = getSecondEl(numbers);
        System.out.println("Took second element " +secondEl+" from List<Integer> with generic method");
        System.out.println(getFirstEl(numbers));
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("---------------------------------");
        System.out.println("Took second element " +getSecondEl(cars)+" from ArrayList<String> with generic method");
        System.out.println(getFirstEl(cars));
    }
public static <T> T getSecondEl(List<T> al){
    System.out.println("first diamond operator is a type param written before return type");
    System.out.println("in parameters we expect ArrayList with same type as a return type");
    return al.get(1);
}
    //in Generic classes can not use first diamond operator with type(s)
    public static <T> String getFirstEl(List<T> al){ //not very efficient
        System.out.println("-------Return type always String:");
        return al.get(0).toString();
    }

}
