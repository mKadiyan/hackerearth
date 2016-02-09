/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.cci.arraysandstrings;

import java.util.Arrays;

public class InverseAString
{
    public static void main(String[] args)
    {
        // String s = "abcdefghijklmnopqrstuvwxyz";
        String s = "ravinder";
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++)
        {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(charArray));
        
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
