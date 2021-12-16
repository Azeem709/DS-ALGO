package dynamicProgramming.twoPointers;

import java.util.Arrays;

/**
 * Given an array of string red's and blue
 * arrange all the blue's to left
 */
public class SeggerateRedBlue {

    static void reArrange(String[] arr){

        int i=0;int j=arr.length-1;

        while(i<j){

            if(arr[i].equals("blue"))
                i++;

            else if(arr[j].equals("red"))
                j--;

//            swap
            else {
                arr[i]="blue";
                arr[j]="red";
                i++;
                j--;
            }

        }

    }
        public static void main(String ar[]){
            String[] arr = new String[]{"red","red","red","blue","blue"};
            reArrange(arr);
            Arrays.asList(arr).forEach(val -> System.out.println("val = " + val));
        }

}
