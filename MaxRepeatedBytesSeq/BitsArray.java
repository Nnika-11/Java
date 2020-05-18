package Java.MaxRepeatedBytesSeq;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BitsArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int[] bytes = new int[256]; //storage for all possible bytes combination after read(), that transform byte [-128 to 127] to [0-255]
        //could be 128 as only positive values
        int max = 0;
        while (file.available() > 0) {
            //bytes[file.read()]++; //index - byte that is read, value - number of repeats
            int readByte = file.read();
            max = max > ++bytes[readByte] ? max : bytes[readByte];
        }
        reader.close();
        file.close();
        
       /* int max = Arrays
                .stream(bytes)    //  array -> IntStream
                .max()            //max OptionalInt
                .getAsInt();      //  OptionalInt -> int*/

        if (max == 1) {
            System.out.println("None");
        }
        else {
            for (int i = 0; i < bytes.length; i++) {
                if (max == bytes[i])
                    System.out.print(i + " ");
            }
        }
    }

}
