package Java;

import java.io.*;
import java.util.ArrayList;

//*************** TASK *****************
//read 2 file names
//first file with double numbers separated with space 3.1415 2.135
//round all doubles from the first file and write to second
//3.49 => 3
//3.505 => 4
//3.51 => 4

public class FileIOStreams {
    public static void main(String[] args) throws IOException {
        //to change In for tests without console:

        //        InputStream fileName = new ByteArrayInputStream(("C:\\test2.txt\n" +
//                "C:\\test.txt").getBytes());
//        System.setIn(fileName);

        //easy to do with FileReader&FileWriter!
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        byte[] bytes = new byte[file1.available()];
        int fileSize = file1.read(bytes);
        reader.close();
        file1.close();
        ArrayList<Double> doubles = new ArrayList<>();
        String numString ="";
        //Arrays.copyOfRange(bytes, from, to);
        for (int i = 0; i < fileSize; i++) {
            if((char)bytes[i]!=' ')
                numString+=(char)bytes[i];
            else {
                doubles.add(Double.parseDouble(numString));
                numString="";
            }
        }
        doubles.add(Double.parseDouble(numString));

        for (double num:doubles) {
            numString = Math.round(num)+" ";
            file2.write(numString.getBytes());
        }
        file2.close();


    }

}
