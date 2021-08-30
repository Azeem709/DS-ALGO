package ds.stack.problems.stackSpanProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Get the count for each items consective lowest(number of times stock has went down )
 */
public class StockSpanProblem {


//

    static class StackData{
        private Integer index;
        private Integer value;


        public StackData(Integer index, Integer value) {
            this.index = index;
            this.value = value;
        }

        public Integer getIndex() {
            return index;
        }

        public Integer getValue() {
            return value;
        }
    }

    //10,20,50,120,90,80,100

    public static Map<Integer,Integer> getStackSpan(int inputArr[]){

        Map<Integer,Integer> result = new HashMap<>();
        Stack<StackData> stack = new Stack<>();
        stack.push(new StackData(inputArr.length-1,inputArr[inputArr.length-1]));

       
        for(int i=inputArr.length-2;i>=0;i--){

            while (!stack.isEmpty() && inputArr[i]>stack.peek().value ){
               result.put(stack.peek().value,stack.peek().index-i);
               stack.pop();

            }
            Set<Integer> integers = result.keySet();

            stack.push(new StackData(i,inputArr[i]));

        }

        while (!stack.isEmpty()){
            result.put(stack.pop().value,1);
        }
        
        return result;


    }




    public static void main(String[] ar) {


        System.out.println("stack span");
        Map<Integer, Integer> stackSpan = getStackSpan(new int[]{100,80,60,70,60,75,85});

        System.out.println("stackSpan = " + stackSpan);
    }
}
