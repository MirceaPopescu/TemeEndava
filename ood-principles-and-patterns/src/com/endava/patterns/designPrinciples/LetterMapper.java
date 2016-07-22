package com.endava.patterns.designPrinciples;

/**
 * Created by mipopescu on 7/22/2016.
 */
public class LetterMapper {
    private char letter = '0';
    private int number = -1;

    public LetterMapper(char lettter) {
        this.letter = lettter;
        this.number = this.letter - 'a' + 1;
    }

    public LetterMapper(int number) {
        this.number = number;
        this.letter = (char) number;
        this.letter = (char) (this.letter + 'a' - 1);
    }

    public char getLettter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "LetterMapper{" +
                "letter=" + letter +
                ", number=" + number +
                '}';
    }
}
