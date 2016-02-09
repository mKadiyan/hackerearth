/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.cci.arraysandstrings;

public class UniqeCharacters
{
    public static void main(String[] args)
    {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int num = 0;
        int a = 'a' - 1;
        for (int i = 0; i < s.length(); i++)
        {
            char charAt = s.charAt(i);
            if ((num & (1 << (charAt - a))) != 0)
            {
                System.out.print("Yes--" + charAt);
                
                break;
            }
            else
            {
                num = num ^ (1 << (charAt - a));
            }
            
        }
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
