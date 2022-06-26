package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {

    @Test
    public void givenASentence_whenWordAreAddedToList_shouldReturnWordFrequency() {

        String sentence = "Paranoids are not paranoid because they are paranoid but because" +
                        " they keep putting themselves deliberately into paranoid avoidable situations";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");

        for(String word : words) {
            Integer value = myHashMap.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;

            myHashMap.add(word,value);
        }

        int frequency = myHashMap.get("paranoid");
        System.out.println("\nMy Hash Map :\n");
        System.out.println(myHashMap +"\n");
        Assertions.assertEquals(3,frequency);
    }
}