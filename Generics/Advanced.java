package Java.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Advanced {
    //TYPE ERASURE
    //code using generics - should be understandable to non generic
    public static void typeErase() {
        List<Integer> numbers = new ArrayList<>();
        //during runtime generic is ignored -> List numbers = new ArrayList();
        numbers.add(5);
        int i = numbers.get(0);
        //during runtime casting: int i = (Integer) numbers.get(0);
        //when overload/override it's not enough to change the type of generics - as it will be ignored by JVM
        //for jvm T - object
    }


    //SUBTYPING

//    Bounded Generics
//     <? extends X> - class X, or it's subclass
    public <T extends Number> void subtypeMethod(T type){
        System.out.println("Type can be only a Number as in Generic I extends it");
        System.out.println(type.getClass());
        System.out.println("var + 5 = "+type+5);
    }

//    Multiple Bounds - first class and then Interfaces after &
    //so the class should implement all interfaces mentioned (not sure)
    public <T extends Number & Comparable> void subtypeMethod2(T type){
        System.out.println("Type can be only a Number as in Generic I extends it");
        System.out.println(type.getClass());
        System.out.println("var + 5 = "+type+5);
    }


    //WILDCARD
    public void wildcardList(List<?> al){
        System.out.println("List accept any type");
        System.out.println("Your list type: "+al.get(0).getClass());
    }

    public static void main(String[] args) {
        Advanced subtype = new Advanced();
        subtype.subtypeMethod(2.2);
//        subtype.subtypeMethod("2.2"); - compile error
        System.out.println("----------------------------------------");
        subtype.wildcardList(new ArrayList<>(Arrays.asList("hello")));
        subtype.wildcardList(new ArrayList<Double>(Arrays.asList(1.5,2.0)));
    }
}
