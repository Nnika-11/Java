package Java;


import java.util.*;

/*
Статические коты
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);


        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
   public static void printArray(int [] arr){
       int n = arr.length;
       for (int i = 0; i < n; ++i)
           System.out.print(arr[i] + " ");
       System.out.println();
   }



    static void merge(int Arr[], int start, int mid, int end) {

        // create a temp array
        int temp[] = new int[end - start + 1];

        // crawlers for both intervals and for temp
        int i = start, j = mid+1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while(i <= mid && j <= end) {
            if(Arr[i] <= Arr[j]) {
                temp[k] = Arr[i];
                k += 1; i += 1;
            }
            else {
                temp[k] = Arr[j];
                k += 1; j += 1;
            }
        }

        // add elements left in the first interval
        while(i <= mid) {
            temp[k] = Arr[i];
            k += 1; i += 1;
        }

        // add elements left in the second interval
        while(j <= end) {
            temp[k] = Arr[j];
            k += 1; j += 1;
        }

        // copy temp to original interval
        for(i = start; i <= end; i += 1) {
            Arr[i] = temp[i - start];
        }
    }

// Arr is an array of integer type
// start and end are the starting and ending index of current interval of Arr

    static void mergeSort(int Arr[], int start, int end) {

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid+1, end);
            merge(Arr, start, mid, end);
        }
    }
}