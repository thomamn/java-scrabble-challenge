package com.booleanuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Scrabble {
    String sWord;
    public Scrabble(String word) {
        sWord=word;
    }

    HashMap<String, Integer> letterValues=new HashMap<String, Integer>(
    );




    public int score() {
        int score=0;
        letterValues.put("AEIOULNRST", 1);
        letterValues.put("DG", 2);
        letterValues.put("BCMP", 3);
        letterValues.put("FHVWY", 4);
        letterValues.put("K", 5);
        letterValues.put("JX", 8);
        letterValues.put("QZ", 10);
        String newWord=sWord.toUpperCase();
        for (char c: newWord.toCharArray()){
            for (String key: letterValues.keySet()){
                for (char d: key.toCharArray()){
                    if(c==d){
                        score+=letterValues.get(key);

                    }
                }
            }
        }
        return score;
    }

}
