package org.example.task2;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class FindArraysTest {

    @Test
    public void testFindStartingIndexOfSubArray_SubArrayFound_ReturnsStartingIndex() {
        int[] array = {4, 9, 3, 7, 8};
        int[] subArray = {9, 3, 7};
        int expectedIndex = 1;
        int actualIndex = FindArrays.findStartingIndexOfSubArray(array, subArray);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testFindStartingIndexOfSubArray_SubArrayNotFound_ReturnsMinusOne() {
        int[] array = {4, 9, 3, 7, 8};
        int[] subArray = {1, 2, 3};
        int expectedIndex = -1;
        int actualIndex = FindArrays.findStartingIndexOfSubArray(array, subArray);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testFindStartingIndexOfSubArray_SubArrayLongerThanArray_ReturnsMinusOne() {
        int[] array = {4, 9, 3, 7, 8};
        int[] subArray = {9, 3, 7, 8, 1};
        int expectedIndex = -1;
        int actualIndex = FindArrays.findStartingIndexOfSubArray(array, subArray);
        assertEquals(expectedIndex, actualIndex);
    }

}
