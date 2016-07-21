package com.endava.junit.process;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.*;

/**
 * Created by mipopescu on 7/21/2016.
 */
public class ProcessPatternTest {
    private ProcessPattern processPattern;

    @Before
    public void setUp() {
        processPattern = new ProcessPattern();
    }

    @Test
    public void nullGradeGeneratePositionTest() {
        String grade = null;
        int age = 42;

        assertNull(processPattern.generatePosition(grade, age));
    }

    @Test
    public void zeroAgeGeneratePositionTest() {
        String grade = "dummy text";
        int age = 0;

        assertNull(processPattern.generatePosition(grade, age));
    }

    @Test
    public void juniorGeneratePositionTest() {
        String grade = "junior";
        int age = 5;

        assertEquals("Junior Developer", processPattern.generatePosition
                (grade, age));
    }

    @Test
    public void dev1GeneratePositionTest() {
        String grade = "middle";
        int age = 1;

        assertEquals("Developer 1", processPattern.generatePosition(grade,
                age));
    }

    @Test
    public void dev2GeneratePositionTest() {
        String grade = "middle";
        int age = 3;

        assertEquals("Developer 2", processPattern.generatePosition(grade,
                age));
    }

    @Test
    public void senior1GeneratePositionTest() {
        String grade = "senior";
        int age = 4;

        assertEquals("Senior 1", processPattern.generatePosition(grade, age));
    }

    @Test
    public void senior2GeneratePositionTest() {
        String grade = "senior";
        int age = 8;

        assertEquals("Senior 2", processPattern.generatePosition(grade, age));
    }

    @Test
    public void unkownPositionGeneratePositionTest() {
        String grade = "Shaormar";
        int age = 10;

        assertEquals("Unknown Position", processPattern.generatePosition
                (grade, age));
    }

    @Test
    public void dev2GeneratePositionTest2(){
        String grade = "middal";
        int age = 4;

        assertEquals("Unknown Position", processPattern.generatePosition
                (grade, age));
    }
}