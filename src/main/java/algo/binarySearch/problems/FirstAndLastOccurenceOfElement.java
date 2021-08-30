package algo.binarySearch.problems;


 /**
 * In a sorted array find the first and last occurenet of element
 */
public class FirstAndLastOccurenceOfElement {
    
    public static void main(String ar[]){
        int[] input = new int[]{1,2,3,4,5,10,10,10,50,70};
        System.out.println("first occurence= " + firstOccurence(input,10));
        System.out.println("Last occurence= " + lastOccurence(input,10));
    }

     /**
      *
      * @param ar
      * @param key
      * @return
      */
    public static int firstOccurence(int[] ar,int key) {

        int low = 0;
        int high = ar.length - 1;
        int firstOccurence = -1;
        while (low < high) {

            int mid = low + (high -low  ) / 2;

            if (key == ar[mid]) {
                firstOccurence = mid;
                high = mid - 1;
            } else if (key > ar[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return firstOccurence + 1;
    }



     public static int lastOccurence(int[] ar,int key) {
         int low = 0;
         int high = ar.length - 1;
         int lastOccurence = -1;
         while (low < high) {

             int mid = low + (high-low)/2;

             if(key == ar[mid]){
                 lastOccurence = mid;
                 low = mid+1;
             }
             else if(key>ar[mid])
                 low = mid+1;
             else
                 high = mid-1;
         }

         return lastOccurence+1;
     }

 }
