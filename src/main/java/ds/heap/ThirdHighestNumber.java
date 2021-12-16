package ds.heap;

import java.util.PriorityQueue;

public class ThirdHighestNumber {


    static int thridHighest(int[] arr,int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i <k; i++)
           priorityQueue.add(arr[i]);


        for(int i=k;i<arr.length;i++){

            if(priorityQueue.peek()<arr[i])
            {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }

        return priorityQueue.peek();

    }

    /**
     *
     *     n + n-k
     *
     *
     * @param ar
     */

    public static void main(String[] ar) {
        System.out.println(thridHighest(new int[]{1, 2, 30, 40, 5, 6, 7, 8},3));

    }
}
