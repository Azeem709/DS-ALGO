package algo.binarySearch;

public class BinarySearch {

    public static int binSearch(int[] a, int key, int low, int high) {
int n = a.length-1;
       while(low<high){

           int mid = low + (high-low)/2;

           if(a[mid] == key)
               return mid;

           if(key<a[mid])
               high = (mid+n-1)%n;
           else if(key > a[mid])
               low = (mid+1)%n;
       }


        return -1;
    }
}
