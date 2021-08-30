package twoPointers;


/**
 * Given an array return if two elements sum is equal to the required sum
 * ex
 * [1,5,6,7,8] , sum = 7, asn = true [1,7]
 * Two pointers approached can be used only if the array is sorted
 */
public class TwoSum {

    static boolean isTwoSum(int ar[], int sum) {
        int j = ar.length - 1;
        int i=0;
        while(i<j) {


            if ((ar[i] + ar[j]) == sum)
                return true;
            if ((ar[i] + ar[j]) > sum)
                j--;
            else if ((ar[i] + ar[j]) < sum)
                i++;



        }
        return false;
    }

        public static void main(String ar[]){
            System.out.println("is two su,= " + isTwoSum(new int[]{1,5,6,7,8},71));
        }

    }

