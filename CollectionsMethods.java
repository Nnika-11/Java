package Java;

import java.util.*;

public class CollectionsMethods {
  //shortkey to get main - psvm (IntelliJ IDEA)
  public static void main(String[] args) {
      List<Integer> numbers = new ArrayList<>(Arrays.asList(-2,-1,1,2,3,4,5,6,7));
      Set<String> daysOfWeek = new HashSet<>(Arrays.asList("Mon","Tue","Wed","Thu","Fri"));
     // forEachIterable(numbers);
     // forEachIterable(daysOfWeek);
     // intRemoveIf(numbers);

      Map<String, String> map = new HashMap<>();

      map.put("key1", "element 1");
      map.put("key2", "element 2");
      map.put("key3", "element 3");
      //forEachMap(map);
      //computeMap(map);
     // computeAbsentMap(map);
      //computePresentMap(map);
//      getValOrDefault(map);

      /*
      Map map2 = new HashMap<String, Integer>();
      mergeMap(map2);
      mergeMaps(map,map2);*/

     // replaceMap(map);
  }



    //Iterable.forEach(Consumer<? super T> action)
    public static void forEachIterable(Collection<?> collection){
      collection.forEach(s -> System.out.print(s + " ")); //Stream.of(1,2,3,4,5,6,7).forEach...
      System.out.println();
    }


    // Collection.removeIf(Predicate<? super E> filter)
    public static void intRemoveIf(Collection<Integer> collection){
      collection.removeIf(s -> (s > 5 || s %2!=0)); //delete all odd nums over 5
        collection.forEach(s -> System.out.print(s + " "));
    }



    //Map.forEach(BiConsumer<? super K, ? super V> action)
    public static void forEachMap(Map<?,?> collection){
        collection.forEach((a,b) -> System.out.println("Key: " + a + ". Value: " + b));
    }



    //Map.compute(K key,BiFunction<? super K, ? super V, ? extends V> remappingFunction)
    //for K key set value - result of remappingFunction (or create one if there is not such key)
    public static void computeMap(Map<String,String> collection){
      collection.compute("key1", (a, b)-> b+" changed"); //Key: key1. Value: element 1 changed
      collection.compute("key5", (a, b)-> b+" changed");  //create - Key: key5. Value: null changed
      collection.compute("key2", (a, b)-> a);  //Key: key2. Value: key2
      collection.forEach((a,b) -> System.out.println("Key: " + a + ". Value: " + b));
    }



    //Map.computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
    //if K key is not exist in a map - create new element with new key and val - result of mappingFunction
    public static void computeAbsentMap(Map<String,String> collection) {
        collection.computeIfAbsent("key1", b -> b + " changed"); //no changes
        collection.computeIfAbsent("key5", b -> b+" changed");  //create - Key: key5. Value: key5 changed
        //with method ref
        collection.computeIfAbsent("key6", CollectionsMethods::getKeyVal); //Key: key6. Value: element 6
        //to add value with lambda
        collection.computeIfAbsent("key4", b -> getKey4Val()); //Key: key4. Value: element 4
        collection.forEach((a, b) -> System.out.println("Key: " + a + ". Value: " + b));
    }

    private static String getKey4Val() {
      return "element 4";
    }
    private static  String getKeyVal(String a) {
        return "element 6";
    }



    //Map.computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
    public static void computePresentMap(Map<String,String> collection) {
        collection.computeIfPresent("key1", (a, b)-> b+" changed"); //Key: key1. Value: element 1 change
        collection.computeIfPresent("key5", (a, b)-> b+" changed");  //no changes
        collection.forEach((a, b) -> System.out.println("Key: " + a + ". Value: " + b));
    }



    //Map.getOrDefault(Object key, V defaultValue)
    public static void getValOrDefault(Map<String,String> collection) {
      String val1 = collection.getOrDefault("key1","default value");
      String val4 = collection.getOrDefault("key4","default value");
        System.out.println(val1); //element 1
        System.out.println(val4); //default value
    }



    //Map.merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
    //puts new value under the given key (if absent) or updates existing key with a given value
    // if remappingFunction key ==null -
    public static void mergeMap (Map<String,Integer> collection) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz", "Fizz"));
        //with just compute
//        words.forEach(word->
//            collection.compute(word, (key, val) ->  val!=null?++val:1 ));
//        -----------------------------------------------------------------------------------------------
        //overwrite old value by simply returning the new one: (old, new) -> new
        //keep the old value by simply returning the old one: (old, new) -> old
        //somehow merge the two, e.g.: (old, new) -> old + new
        //or even remove old value: (old, new) -> null
        words.forEach(word->
                collection.merge(word,1,(prev,newVal)->++prev));
        //collection.forEach((a, b) -> System.out.println("Key: " + a + ". Value: " + b));
    }
    public static void mergeMaps (Map<String,String> map1, Map<String,Integer> map2) {
        map2.forEach((keyStr, valInt)->
            map1.merge(keyStr,valInt.toString(),(oldVal, newVal)->oldVal));

        map1.forEach((a, b) -> System.out.println("Key: " + a + ". Value: " + b));
        System.out.println("\nmap2 before merge");
        map2.forEach((a, b) -> System.out.println("Key: " + a + ". Value: " + b));
        map1.forEach((keyStr, valStr)->
                map2.merge(keyStr,1,(oldVal, newVal)->newVal+oldVal));
        System.out.println("\nmap2 after merge ");
        map2.forEach((a, b) -> System.out.println("Key: " + a + ". Value: " + b));
    }




    //Map.replace(K key, V newValue) - change if kew = K
    //Map.replace(K key, V oldValue, V newValue) change if kew = K && value = V
    //Map.replaceAll(BiFunction<? super K, ? super V, ? extends V> function) - replace all val to result of function
    public static void replaceMap (Map<String,String> map) {
        System.out.println("\nmap before replace");
        map.forEach((a, b) -> System.out.println("Key: " + a + ". Value: " + b));
        map.replaceAll((a,b) -> getKey4Val());
        System.out.println("\nafter");
        map.forEach((a, b) -> System.out.println("Key: " + a + ". Value: " + b));
    }



}
