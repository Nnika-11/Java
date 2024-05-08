package Java.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 ----------
 Generics
 ----------
 Type Safe & Reusable Code
 Parameterized Class         Parameterized Method

 <?> - any class
 <? extends X> - class X, or it's subclass
 <? super Y> - class Y, or it's superclass
 --------------------------------------------------------------------
 The most commonly used type parameter names are:
 E - Element (used extensively by the Java Collections Framework)
 K - Key
 N - Number
 T - Type
 V - Value
 S, U, V etc. - 2nd, 3rd, 4th types
 */
public class AnIntro {
    public static void main(String[] args) {
        //raw type
        List rawList = new ArrayList();
      rawList.add("ok");
      rawList.add(5);
      rawList.add(new StringBuilder("jjljklkl"));

        System.out.println("--------------Walk through raw typed List:-----------------");
      for (Object o : rawList){
          System.out.println(o+ " is "+o.getClass() );
//          System.out.println(o + "length"+ ((String)o).length()); -- java.lang.ClassCastException
      }

        System.out.println("--------------Type safe & reusable code:-----------------");
        List<String> list = new ArrayList<>();

    }
}
