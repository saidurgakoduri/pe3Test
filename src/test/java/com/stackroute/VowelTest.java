package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;




public class VowelTest {
    Vowel obj = new Vowel();
    @Test
    public void vowelcheck()
    {
        String[] result = obj.check(new String[]{"India,United States,Germany,Egypt,Czechoslovakia"});
            assertArrayEquals(new String[]{"Ind, Untd Stts,Grmny,Egypt,czchslvk"},result);
        }

    }
}
