package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {
    Matrix obj = new MatrixTest();

    @Test
public void matrixSum()
    {
        int[][] result = obj.Sum(new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{9, 8, 7}, {6, 5, 4}});
        assertArrayEquals(result,new int[][]{{10,10},{10,10},{10,10}});
    }
    @Test
public void matrixSumFail()
{
    int[][] result = obj.Sum(new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{9, 8, 7}, {6, 5, 4}});
    assertArrayEquals(result,new int[][]{{10,10},{10,10}});
}

 }