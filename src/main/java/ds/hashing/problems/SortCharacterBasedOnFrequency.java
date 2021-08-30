package ds.hashing.problems;

import java.util.*;

public class SortCharacterBasedOnFrequency {

    public static void sortBasedOnCharacter(int[] input) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int count = 0;

            if (frequencyMap.containsKey(input[i]))
                count = frequencyMap.get(input[i]) + 1;
            else
                count = 1;

            frequencyMap.put(input[i], count);
            resultList.add(input[i]);
        }

        Collections.sort(resultList,new CharComparator(frequencyMap));

        System.out.println("resultList = " + resultList);


    }



    public static void main(String arp[]){
        sortBasedOnCharacter(new int[]{5,4,2,2,3,5,5,5,5,5,5,3,2});
    }
}



class CharComparator implements Comparator<Integer>{

    Map<Integer,Integer> freqMap;
    CharComparator(Map<Integer,Integer> inputMap){
        this.freqMap = inputMap;
    }
    @Override
    public int compare(Integer k1, Integer k2) {


        // Compare value by frequency
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));

        // Compare value if frequency is equal
        int valueCompare = k1.compareTo(k2);

        // If frequency is equal, then just compare by value, otherwise -
        // compare by the frequency.
        if (freqCompare == 0)
            return valueCompare;
        else
            return freqCompare;
    }
}
