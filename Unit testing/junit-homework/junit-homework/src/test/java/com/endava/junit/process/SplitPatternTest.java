package com.endava.junit.process;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mipopescu on 7/21/2016.
 */
public class SplitPatternTest {
    private SplitPattern splitPattern;
    private List<String> inputList;

    @Before
    public void setUp(){
        splitPattern = new SplitPattern();
        inputList = new ArrayList<String>();

        inputList.add("strawberry banana");
        inputList.add("kiwi");
        inputList.add("green apples and sour cherries");
        inputList.add("water");
    }

    @Test
    public void TestStringLengthTest_null(){
        String testString = null;

        assertNull(splitPattern.getStringLength(testString));
    }

    @Test
    public void getStringLengthTest_short(){
        String testString = "hi!";

        assertEquals("small", splitPattern.getStringLength(testString));
    }

    @Test
    public void getStringLengthTest_medium(){
        String testString = "12345678";

        assertEquals("medium", splitPattern.getStringLength(testString));
    }

    @Test
    public void getStringLengthTest_long(){
        String testString = "0123456789ABCDEF";

        assertEquals("long", splitPattern.getStringLength(testString));
    }

    @Test
    public void splitByLengthTest1(){
        assertEquals(4, splitPattern.splitByLength(inputList).size());
    }

    @Test
    public void splitByLengthTest2(){
        ArrayList<String> referenceList = new ArrayList<String>();
        referenceList.add("long");
        referenceList.add("small");
        referenceList.add("long");
        referenceList.add("medium");

        assertEquals(referenceList, splitPattern.splitByLength(inputList));
    }

}