package com.endava.patterns.designPrinciples;

import java.util.ArrayList;

/**
 * Created by mipopescu on 7/22/2016.
 */
public class LetterMapperTests {
    public static void main(String[] args) {
        System.out.println(getAlphabet());
    }

    static ArrayList<LetterMapper> getAlphabet(){
        ArrayList<LetterMapper> alphabet = new ArrayList<>();

        for(char letter = 'a'; letter <= 'z'; letter++){
            alphabet.add(new LetterMapper(letter));
        }

        return alphabet;
    }
}
