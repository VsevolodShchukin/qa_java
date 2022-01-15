package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private final String sex = "Самец";

    @Mock
    Feline feline;

    @Test
    public void shouldReturnLionsListOfFood() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnLionsNumberOfKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        assertEquals(expectedResult, actualResult);
    }


}
