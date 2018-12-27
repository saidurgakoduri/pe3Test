package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {
    Matrix obj = new Matrix ();

    @Test
public void matrixSum1()
    {
        int[][] result = obj.Sum(new int[][]{{1, 2},{3,4},{5,6}}, new int[][]{{9, 8},{7,6},{5,4}});
        assertArrayEquals(result,new int[][]{{10,10},{10,10},{10,10}});
    }
    @Test
    public void matrixSum2()
    {
        int[][] result = obj.sum(new int[][]{{1,2},{3,4}}, new int[][]{{4,3},{2,1}});
        assertArrayEquals(new int[][]{{5,5},{5,5}},result);
    }
    @Test
    public void matrixSum3()
    {
        int[][] result = obj.sum(new int[][]{{1, 2, 3}, {4, 5, 6},{7,8,9}}, new int[][]{{9, 8, 7}, {6, 5, 4},{1,2,3}});
        assertArrayEquals(new int[][]{{10,10,10},{10,10,10},{10,10,10}},result);
    }
    @Test
public void matrixSumFail()
{
    int[][] result = obj.Sum(new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{9, 8, 7}, {6, 5, 4}});
    assertNotEquals(result,new int[][]{{10,10},{10,10}});
}

 }