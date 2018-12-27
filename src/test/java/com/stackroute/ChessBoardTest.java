package com.stackroute;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest
{
    ChessBoard pattern = new ChessBoard();


    @Test
    public void getColor_1()
    {
        String expectedColor = "WW";

        String actualColor = pattern.getColor(0,0);//For 0th row 0th column

        assertEquals(expectedColor, actualColor);
    }

    @Test
    public void getColor_2()
    {
        String expectedColor = "BB";

        String actualColor = pattern.getColor(7,6);//For 7th row 6th column

        assertEquals(expectedColor, actualColor);
    }

    @Test
    public void getColor_3()
    {
        String expectedColor = "WW";

        String actualColor = pattern.getColor(2,7);//For 2nd row 7th column

        assertNotEquals(expectedColor, actualColor);
    }

    @Test
    public void getColor_4()
    {
        String expectedColor = "WW|BB|WW|BB|WW|BB|WW|BB|";

        String actualColor = pattern.getRow(2);//Get the Whole 2nd Row

        assertEquals(expectedColor, actualColor);
    }

    @Test
    public void getColor_5()
    {
        String expectedColor = "BB|WW|BB|WW|BB|WW|BB|WW|";

        String actualColor = pattern.getColumn(7);//Get the Whole 7th Column

        assertEquals(expectedColor, actualColor);
    }
}