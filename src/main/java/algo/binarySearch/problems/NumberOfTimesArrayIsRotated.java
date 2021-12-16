package algo.binarySearch.problems;

import algo.binarySearch.BinarySearch;

/**
 * index of minimum element in array will give no of times array is rotated
 * input : [ 7,8,1,2,3,4,5,6] o/p : 2(index of min element
 */
public class NumberOfTimesArrayIsRotated {


    /**
     * find min element as if 8<1<2 
     * if mid is not min element then check in unsorted array
     * 
     * @param ar
     * @return
     */
    static int noOfTimesRotated(int ar[]){
        int start = 0;int end = ar.length-1;
        int n = ar.length-1;
        int mid=0;


        while(start<=end){
            
            mid = start + (end-start)/2;
            int left = (mid+n-1)% n; //todo module for adjust end cases
            int right = (mid+1)%n;
            
            if(ar[mid]<ar[left] && ar[mid]< ar[right])
                return mid;
            
            if(ar[start] <= ar[mid]){
            start = right;
        }
        else  if(ar[mid] <= ar[end])
            end = left;

    }
        
        return -1;
    }


    static int elementInRotatedArray(int arp[],int key){
        int minElement = noOfTimesRotated(arp);
        int positionOfElement;
        positionOfElement =   BinarySearch.binSearch(arp,key,0,minElement-1);
        if(positionOfElement == -1)
        positionOfElement =  BinarySearch.binSearch(arp,key,minElement,arp.length-1);
        return positionOfElement +1;

    }
    
    
    
    
    public static  void main(String ar[]){
        System.out.println("noOfTimesRotated(new int[]{7,8,1,2,3,4,5,6}) = " + noOfTimesRotated(new int[]{7,8,1,2,3,4,5,6}));
        System.out.println("element is at " + elementInRotatedArray(new int[]{7,8,1,2,3,4,5,6},1));

    }
}
