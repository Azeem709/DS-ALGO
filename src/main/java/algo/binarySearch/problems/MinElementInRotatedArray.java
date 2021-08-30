//package algo.binarySearch.problems;
//
//
///**
// * Find the minimum element in a sorted and rotated array
// *Examples:
// *
// * Input: {5, 6, 1, 2, 3, 4}
// * Output: 1
// *
// * Input: {1, 2, 3, 4}
// * Output: 1
// *
// * Input: {2, 1}
// * Output: 1
// *
// *
// *
// * Solution : Since array is sorted can be solved by binary search
// *             1. find the mid element and if (mid-1)is greater than mid then mid is the min element
// *             2. if there is no element on mid-1 then mid is the min element
// *              3.if mid is smaller than last elemenet then element lest on left else right
// *
// *
// *
// * {3, 4, 5,6,1, 2}
// * if(4>5) false
// * if(5<
// *
// */
//public class MinElementInRotatedArray {
//
//
//    public static int minElement(int arr[]){
//
//    }
//
//    private static int binary(int arr[],int low,int high){
//
//        if(low == high)
//            return arr[low];
//
//
//        int mid = low+high/2;
//
//        if(arr[mid-1] > arr[mid])
//            return arr[mid];
//
//        if(mid < 0)
//
//
//
//    }
//
//}
