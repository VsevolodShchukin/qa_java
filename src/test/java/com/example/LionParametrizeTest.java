package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParametrizeTest {

    private final String sex;
    private final boolean expectedResult;
    private final Feline feline;

    public LionParametrizeTest(String sex, Feline feline, boolean expectedResult) {
        this.sex = sex;
        this.feline = feline;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getMultiplicationData() {
        return new Object[][]{
                {"Самец", null, true},
                {"Самка", null, false}
        };
    }

    @Test
    public void shouldHasManeIfMale() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }


}