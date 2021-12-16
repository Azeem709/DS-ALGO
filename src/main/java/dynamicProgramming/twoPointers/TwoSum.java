package dynamicProgramming.twoPointers;


import java.util.HashSet;

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


    /**
     * a+b = c => b = c-a
     * 1,2 sim=3
     * @param ar
     * @param sum
     */
    static void printAllPairsHavingSum(int[] ar,int sum){

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<ar.length;i++){

            int temp = sum - ar[i];
            if(set.contains(temp))
                System.out.println("pars [] " + temp +" "+ar[i]);

            set.add(ar[i]);

        }
    }

        public static void main(String ar[]){
            System.out.println("is two su,= " + isTwoSum(new int[]{1,5,6,7,8},71));

            printAllPairsHavingSum(new int[]{1,5,1,7,8,9},6);
        }

    }

