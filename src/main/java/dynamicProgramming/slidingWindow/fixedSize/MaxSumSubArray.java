package dynamicProgramming.slidingWindow.fixedSize;


/**
 * Question :
 *              Find the maximum sub array with size K
 */
public class MaxSumSubArray {

    /**
     *     Find the maximum sub array with size K
     */
    public static int maxSum(int ar[],int windowSize){

        int i=0;
        int j=0;
        int maxSum = 0;
        int sum = ar[i];

                while(j<ar.length-1){

                    if(j-i+1 < windowSize){
                        j++;
                        sum = sum + ar[j];

                    }
                    else if(j-i+1 == windowSize){
                        sum = sum - ar[i];
                        i++;
                        j++;
                        sum  = sum + ar[j];

                        maxSum = sum>maxSum?sum:maxSum;


                    }

                }


                return maxSum;
    }
    public static void main(String[] ar){
        System.out.println("max Sum = " + maxSum(new int[]{1,2,30,4,8,10},3));
    }
}
