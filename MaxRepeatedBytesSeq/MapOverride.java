package Java.MaxRepeatedBytesSeq;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

public class MapOverride {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> myMap = new MyMap<>();
        while (file.available()>0){
            myMap.put(file.read(),0);
        }
        reader.close();
        file.close();
        Integer max = Collections.max(myMap.values());
        System.out.println(myMap);
        for (Integer bytes : myMap.keySet()) {
            if(max==myMap.get(bytes)){
                System.out.print(bytes+" ");
            }
        }

    }
    static class MyMap<K, V> extends HashMap {

        @Override
        public Object put(Object key, Object value) {
            if (value instanceof Integer) {
                if (containsKey(key)) {
                    Integer v = (Integer) get(key) + 1;
                    return super.put(key, v);
                } else {
                    // if there isn't key, value = 1
                    return super.put(key, 1);
                }
            }
            return super.put(key, value);
        }
    }
}
