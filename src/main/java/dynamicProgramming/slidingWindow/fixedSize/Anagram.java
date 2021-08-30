package dynamicProgramming.slidingWindow.fixedSize;

import java.util.HashMap;

/**
 * problem statment : Return number of anagrams in a string
                    ex str = 'abcababca' anagram ='abc'
                    o/p = 2 -> abc and bca
 */
public class Anagram {


    /**
     *
     */
    public static int numberOfAnagram(String str,String anagram){

        HashMap<Character,Integer> map = new HashMap<>();
        int distinctCount = 0;
        int resultCount = 0;

        for( int i=0;i<anagram.length();i++){
            int count = 1;
            if(map.containsKey(anagram.charAt(i))){
                count = map.get(anagram.charAt(i)) + 1;
                map.put(anagram.charAt(i),count);
            }else{
                map.put(anagram.charAt(i),count);
                distinctCount ++;
            }

        }

        int i=0;int j=0;
        map.put(str.charAt(i),1);

        while (j<str.length()-1){

            System.out.println(str.length());
            System.out.println(j);


            if(j-i<anagram.length()){
                int count =1;
                if(map.containsKey(str.charAt(j))){
                    count = map.get(str.charAt(j)) - 1;
                    map.put(str.charAt(j),count);
                    distinctCount--;
                }
                j++;


            }

//            aaaabc

            else if(j-i == anagram.length()){
                if(distinctCount == 0)
                    resultCount++;
                if(map.containsKey(str.charAt(i))){
                    int count = map.get(str.charAt(i)) + 1;
                    map.put(str.charAt(i),count);
                    distinctCount++;
                }
                i++;
                j++;
                if(map.containsKey(str.charAt(j))){
                    int count = map.get(str.charAt(j)) - 1;
                    map.put(str.charAt(j),count);
                    distinctCount --;
                }

            }
        }
        
        return resultCount;


    }
    
    
    public static void main(String ar[]){
        System.out.println("numberOfAnagram(\"abcabcabc\",\"abc\") = " + numberOfAnagram("abcabcabc","abc"));
    }
}
