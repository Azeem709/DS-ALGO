package ds.hashing.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccurence {


    private static Character maxCharOccurence(String inputString){


        Character maxOccuredChar = null;


        Map<Character,Integer> frequencyMap = new HashMap<Character,Integer>();


        for(int i=0;i<inputString.length()-1;i++){

            int charFreq;
            if(frequencyMap.containsKey(inputString.charAt(i))){

                charFreq = frequencyMap.get(inputString.charAt(i))+1;
            }
            else
                charFreq = 1;

            frequencyMap.put(inputString.charAt(i),charFreq);
        }

//
        int maxRepeating= Integer.MIN_VALUE;
        Set<Character> keySet = frequencyMap.keySet();
        for(Character key : keySet){
            if(frequencyMap.get(key)>maxRepeating){
                maxOccuredChar = key;
                maxRepeating = frequencyMap.get(key);

            }

        }

        return maxOccuredChar;
    }

    public static void main(String[] ar){

        Character maxRepeatingChar = maxCharOccurence("aaaabbbbbfffffddddddd");
        System.out.println(maxRepeatingChar);
        
      Integer asciValue = (int)maxRepeatingChar;
        System.out.println("asciValue = " + asciValue);

    }
}
