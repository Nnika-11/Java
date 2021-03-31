package Java;


/*
For example, words: ["This", "is", "an", "example", "of", "text", "justification."]
    L: 16.
    Return the formatted lines as:
            [
            "This is an",
            "example of text",
            "justification. "
            ]
*/

import java.util.ArrayList;
import java.util.List;

class SolutionTest {
    public static void main(String[] args) {
        String[] arr = {"This", "is", "an", "example", "of", "text", "justification."};
        formatArr(arr,16);

    }
    public static void formatArr(String [] arr, int lines){
        List<String> result = new ArrayList<String>();

        String text = "";
        int len=0, counter=0;

        for (int i=0; i<arr.length;i++){
            int n = len+arr[i].length();
            if(n<=lines) {
                len += n+1;
                text +=arr[i]+" ";
            }
            else {
                i--;
                System.out.println(text);
                result.add(text);
                text="";
                len = 0;

            }

        }
//            String el = "";
//
//            for (int i = 0; i < lines; i++) {
//                el = el+text.toCharArray()[i];
//            }
//            result.add(el);




    }

}