/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.string;

import java.util.Arrays;

public class RearrangeStrings
{
    public static void main(String[] args)
    {
        String exmpl = new String("I Love Java Programming");
        String[] parts = exmpl.split("\\s+");
        Arrays.sort(parts);
        StringBuilder sb = new StringBuilder();
        for (String s : parts)
        {
            sb.append(s);
            sb.append(" ");
        }
        
        String sorted = sb.toString().trim();
        System.out.println(sorted);
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
