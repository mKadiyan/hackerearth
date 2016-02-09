/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.cci.timeic;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println(removeDuplicateChars("abc aac "));
        
    }
    
    public static String removeDuplicateChars(String input)
    {
        StringBuilder output = new StringBuilder("");
        char temp;
        if (input == null || input.length() == 0)
            return output.toString();
        for (int counter = 0; counter < input.length(); counter++)
        {
            temp = input.charAt(counter);
            if (temp != ' ')
                output.append(temp);
            input = input.replace(temp, ' ');
            
        }
        return output.toString();
        
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
