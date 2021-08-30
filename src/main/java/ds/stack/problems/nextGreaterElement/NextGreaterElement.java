package ds.stack.problems.nextGreaterElement;


import javafx.scene.chart.StackedAreaChart;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Element        NGE
 * 13      -->    -1
 * 7       -->     12
 * 6       -->     12
 * 12      -->     -1
 */
public class NextGreaterElement {


    /**
     * as we need two loops tc will be n2
     *
     * @param arr
     */
    public static void nextGreater(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int nextGreater = -1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    nextGreater = arr[j];
                    break;
                }

            }
            System.out.println(arr[i] + "NGE -> " + nextGreater);
        }
    }


    public static void printNextGreaterElement(int[] input) {


        Stack<Integer> stack = new Stack<Integer>();
        int inputSize = input.length;
        stack.push(input[0]);
        for (int i = 1; i < inputSize; i++) {
            while (!stack.isEmpty() && stack.peek() < input[i]) {
                System.out.println("Next greater element for "
                         + stack.pop() + "\t = " + input[i]);
            }
            stack.push(input[i]);
        }
        while (!stack.isEmpty()) {
            int top = (int) stack.pop();
            System.out.println("Next greater element for " + top + "\t = " + null);
        }
    }

    public static void printNextSmallestEl(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++){

            while (!stack.isEmpty() && arr[i]<stack.peek()){
                System.out.println("Next smallest element for "+stack.pop()+"="+arr[i]);
            }
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()){
            System.out.println("stack = " + stack.pop()+"=-1");
        }
    }

    public static void main(String[] ar) {
        printNextSmallestEl(new int[]{11, 6, 12, 21, 5});
//        nextGreater(new int[]{11, 6,12, 21, 5});
    }
}
