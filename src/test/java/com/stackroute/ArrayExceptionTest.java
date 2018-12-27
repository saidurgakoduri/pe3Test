package com.stackroute;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ArrayExceptionTest
{
    @Rule
    public ExpectedException myException = ExpectedException.none();

    @Test
    public void negativeIndexException()
    {
        String exceptionMessage = "Array Index Can't Be Negative";
        myException.expect(NegativeArraySizeException.class);
        myException.expectMessage(exceptionMessage);
        new ArrayException(-1);
    }

    @Test
    public void checkIndex_1()
    {
        ArrayException array = new ArrayException(10);
        String exceptionMessage = "Index can't be Less than 0";
        myException.expect(IndexOutOfBoundsException.class);
        myException.expectMessage(exceptionMessage);
        array.checkIndex(-1);
    }

    @Test
    public void checkIndex_2()
    {
        ArrayException array = new ArrayException(10);
        String exceptionMessage = "Index is Larger than Array Dimension";
        myException.expect(IndexOutOfBoundsException.class);
        myException.expectMessage(exceptionMessage);
        array.checkIndex(11);
    }

    @Test
    public void checkIndex_3()
    {
        ArrayException array = new ArrayException(10);
        assertTrue(array.checkIndex(4));
    }

    @Test
    public void nullPointerException_1()
    {
        String exceptionMessage = "Please Specify Array Dimension";
        myException.expect(NullPointerException.class);
        myException.expectMessage(exceptionMessage);
        new ArrayException();
    }

    @Test
    public void nullPointerException_2()
    {
        ArrayException array = new ArrayException(10);
        String exceptionMessage = "Please Specify Array Index";
        myException.expect(NullPointerException.class);
        myException.expectMessage(exceptionMessage);
        array.checkIndex();
    }


}