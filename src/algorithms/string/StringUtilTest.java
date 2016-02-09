/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import algorithms.sorting.Utility;

@RunWith(JUnitParamsRunner.class)
public class StringUtilTest
{
    private StringUtil stringUtil;
    
    @Before
    public void setUp() throws Exception
    {
        stringUtil = new StringUtil();
    }
    
    @Test
    @Parameters({ "abcdef, true", "fFdD, true", "mjhKk, true", "sdef, true", ", true", "a, true",
        "aabcdef,false", "aghtdfsa,false", "gGg,false", "AA,false" })
    public void passString_checkIfUniqueness_returnResult(String s, boolean flag) throws Exception
    {
        assertTrue(stringUtil.assciHasUniqueCharacters(s) == flag);
    }
    
    @Test
    @Parameters({ "abcdef, true", "def, true", "a, true", "ghed, true", ", true", "def, true",
        "z, true", "xyz, true", "abcefa,false", "aa,false", "zz,false", "azopz,false" })
    public void passStringWithUniqueAlpha_checkIfUniqueness_returnTrue(String s, boolean flag) throws Exception
    {
        assertTrue(stringUtil.alphabetHasUniqueCharacters(s) == flag);
    }
    
    @Test
    @Parameters({ "abcdef,fedcba", "aa,aa", "z,z", "ravinder, rednivar" })
    public void reverseAString_gotReverseString(String input, String output) throws Exception
    {
        assertEquals(output, stringUtil.reverse(input));
    }
    
    @Test
    @Parameters({ "abcde,edcba,true", "abc,bcb,false", ",,true", "a   ab,b   a,false",
        "a   ab,b   aa,true" })
    public void reverseAString_gotReverseString(String s1, String s2, boolean flag) throws Exception
    {
        assertTrue(stringUtil.isPermutation(s1, s2) == flag);
    }
    
    @Test
    @Parameters({ "a bc  d,a%20bc%20%20d", "a   a,a%20%20%20a", "abcdss,abcdss" })
    public void replaceAStringWithSymbol_gotFinalStringString(String input, String output) throws Exception
    {
        assertEquals(output, stringUtil.replaceASpaceWithSymbol(input));
    }
    
    @Test
    @Parameters({ "aabcccccaaa,a2bc5a3", "ravinder,ravinder", "rravinder,r2avinder" })
    public void compressAString_gotExpectedString(String input, String output) throws Exception
    {
        assertEquals(output, stringUtil.compress(input));
    }
    
    @Test
    public void rotate() throws Exception
    {
        int[][] arr = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
        
        };
        Utility.print(arr);
        stringUtil.rotate(arr);
        Utility.print(arr);
    }
    
    @Test
    public void setRowColumn() throws Exception
    {
        int[][] arr = {
            { 1, 1, 3 },
            { 4, 5, 0 },
            { 7, 8, 0 },
        
        };
        Utility.print(arr);
        stringUtil.setRowColumnToZero(arr);
        Utility.print(arr);
    }
    
    @Test
    @Parameters({ "waterbottle,erbottlewat,true", "waterbottle,erbottlewatt,false" })
    public void isRotation(String s1, String s2, boolean flag) throws Exception
    {
        assertTrue(stringUtil.isRotation(s1, s2) == flag);
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
