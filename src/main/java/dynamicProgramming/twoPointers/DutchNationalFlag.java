package dynamicProgramming.twoPointers;

import java.util.Arrays;

public class DutchNationalFlag {


    public static void sort(int[] ar){

        int low = 0;
        int mid =0;
        int high = ar.length-1;

        while(mid<=high){

            if(ar[mid] == 0)
            {
                int temp = ar[low];
                ar[low] = ar[mid];
                ar[mid] = temp;
                mid ++;
                low++;

            }

           else if(ar[mid]==1)
                mid ++;

           else if(ar[mid] == 2){
                int temp = ar[mid];
                ar[mid] = ar[high];
                ar[high] = temp;
                high--;
            }


        }



    }


    public static void main(String ar[]){
        int[] ints = {0, 1, 2, 0, 1, 2};
        sort(ints);
    for(int i : ints)
        System.out.println(i);
    }
}
