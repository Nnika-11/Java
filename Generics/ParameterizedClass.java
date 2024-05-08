package Java.Generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> paramClass1 = new Info<>("value to call constructor with type from the call");
        System.out.println(paramClass1);
        Pair<String, Integer> paramClass2= new Pair<>("Value1",2);
        System.out.println(paramClass2.getValue1()+ " is "+paramClass2.getValue1().getClass() + ", "+paramClass2.getValue2());
        TwoParamsClass<String> paramClass3= new TwoParamsClass<>("Value1","Value2");
        System.out.println("both params should be the same type");
    }
}
class Info<T>{ //type placeholder - T - type, E - element, K - key, V - value
    private T value; //type, never static
    public Info(T value){
        this.value = value;
    }
    public String toString(){
        return "{["+value+"]}";
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }
    public V2 getValue2(){
        return value2;
    }
}

class TwoParamsClass<V>{
    private V value1;
    private V value2;

    public TwoParamsClass(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }
    public V getValue2(){
        return value2;
    }
}