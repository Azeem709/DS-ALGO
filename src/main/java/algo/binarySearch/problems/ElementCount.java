package algo.binarySearch.problems;

import static algo.binarySearch.problems.FirstAndLastOccurenceOfElement.firstOccurence;
import static algo.binarySearch.problems.FirstAndLastOccurenceOfElement.lastOccurence;


/**
 * If array is sorted we can use binary search to get last and first occurence then the difference will be
 * count of elements
 *  TC : log(n)
 */
public class ElementCount {


    public static void main(String ar[]){
        int[] input = new int[]{1,2,3,4,5,10,10,10,50,70};
        int count = lastOccurence(input,10) - firstOccurence(input,10) +1;
        System.out.println("Total Count = " + count);

    }
}
