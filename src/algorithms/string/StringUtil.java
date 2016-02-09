/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.string;

public class StringUtil
{
    /**
     * Check is string has unique characters
     * 
     * @param s a-z in small
     * @return true if unique else false
     */
    public boolean alphabetHasUniqueCharacters(String s)
    {
        int checker = 0;
        for (int i = 0; i < s.length(); i++)
        {
            int val = s.charAt(i) - 'a';
            if ((checker & (1 << val)) != 0)
                return false;
            checker |= 1 << val;
        }
        return true;
    }
    
    /**
     * Check if string has unique characters
     * 
     * @param s assci string
     * @return true if unique else false
     */
    public boolean assciHasUniqueCharacters(String s)
    {
        boolean[] arr = new boolean[256];
        for (int i = 0; i < s.length(); i++)
        {
            if (arr[s.charAt(i)])
                return false;
            arr[s.charAt(i)] = true;
        }
        return true;
    }
    
    public String reverse(String s)
    {
        char[] rev = new char[s.length()];
        for (int i = 0; i < s.length() / 2 + 1; i++)
        {
            rev[i] = s.charAt(s.length() - 1 - i);
            rev[s.length() - i - 1] = s.charAt(i);
        }
        return new String(rev);
    }
    
    public boolean isPermutation(String s1, String s2)
    {
        if (s1.length() != s2.length())
            return false;
        int[] arr = new int[256];
        for (int i = 0; i < s1.length(); i++)
        {
            arr[s1.charAt(i)]++;
            
        }
        for (int i = 0; i < s2.length(); i++)
        {
            arr[s2.charAt(i)]--;
            if (arr[s2.charAt(i)] < 0)
                return false;
        }
        return true;
    }
    
    /**
     * Replace space with %20
     * 
     * @param s
     * @return
     */
    public String replaceASpaceWithSymbol(String s)
    {
        int spaceCount = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
                spaceCount++;
        }
        int newLength = s.length() + spaceCount * 2;
        char[] fString = new char[newLength];
        
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) == ' ')
            {
                fString[newLength - 1] = '0';
                fString[newLength - 2] = '2';
                fString[newLength - 3] = '%';
                newLength -= 3;
            }
            else
            {
                fString[newLength - 1] = s.charAt(i);
                newLength--;
            }
            
        }
        
        return new String(fString);
    }
    
    public String compress(String input)
    {
        StringBuilder s = new StringBuilder();
        int count = 0;
        char last = ' ';
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == last)
                count++;
            else
            {
                if (count > 0)
                {
                    s.append(count + 1);
                }
                s.append(input.charAt(i));
                last = input.charAt(i);
                count = 0;
            }
        }
        if (count > 0)
            s.append(count + 1);
        return s.toString();
    }
    
    public void rotate(int[][] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][n - i - 1];
                arr[j][n - i - 1] = arr[n - i - 1][n - j - 1];
                arr[n - i - 1][n - j - 1] = arr[n - j - 1][i];
                arr[n - j - 1][i] = temp;
            }
        }
    }
    
    public void setRowColumnToZero(int[][] arr)
    {
        int n = arr.length;
        boolean[] row = new boolean[arr.length];
        boolean[] column = new boolean[arr[0].length];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] == 0)
                {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (row[i] || column[j])
                {
                    arr[i][j] = 0;
                }
            }
        }
    }
    
    public boolean isRotation(String s1, String s2)
    {
        int len = s1.length();
        if (len == s2.length() && len > 0)
        {
            String s1s1 = s1 + s1;
            return s1s1.indexOf(s2) != -1;
        }
        return false;
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
