package Java.MaxRepeatedBytesSeq;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAlgorithm {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        List<Integer> nums = new ArrayList<>();
        List<Integer> repArr = new ArrayList<>();
        while (file.available()>0){
            nums.add(file.read());
        }
        reader.close();
        file.close();

        Collections.sort(nums);
        int rep=0, maxRep =0;
        for (int i = 0; i < nums.size()-1; i++) {
            if(nums.get(i)==nums.get(i+1)) {
                rep++;
                if (rep > maxRep) {
                    repArr.clear();
                    repArr.add(nums.get(i));
                    maxRep = rep;
                    rep = 0;
                } if (rep == maxRep)
                    repArr.add(nums.get(i));
            }
            else rep = 0;
        }
        //     System.out.println(nums);
        for (int num: repArr
        ) {
            System.out.print(num+" ");
        }
    }
}
//easier with collections -
//int max = 0;
//for (int i = 0; i < a.size(); i++) {
//        int count = Collections.frequency(a, a.get(i));
//        max = count > max ? count : max;
//        }