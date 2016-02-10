/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.dynamicprogramming;

import algorithms.sorting.Utility;

/**
 * Longest common subsequence
 * 
 * @author rsk
 *
 */
public class Lca
{
    private static int ar[][] = null;
    
    public static void main(String[] args)
    {
        String S = "ABAZDC";
        String T = "BACBAD";
        LCA(S, T);
        initAr(S.length(), T.length());
        
        LCA(S, S.length(), T, T.length());
        Utility.print(ar);
        
    }
    
    private static void initAr(int s, int t)
    {
        ar = new int[s][t];
        for (int i = 0; i < s; i++)
        {
            for (int j = 0; j < t; j++)
            {
                ar[i][j] = 0;
            }
        }
        
    }
    
    private static void LCA(String s, String t)
    {
        int[][] arr = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i < s.length() + 1; i++)
        {
            for (int j = 1; j < t.length() + 1; j++)
            {
                if (s.charAt(i - 1) != t.charAt(j - 1))
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                else
                    arr[i][j] = arr[i - 1][j - 1] + 1;
            }
        }
        Utility.print(arr);
    }
    
    private static int LCA(String S, int s, String T, int t)
    {
        if (s == 0 || t == 0)
            return 0;
        if (ar[s - 1][t - 1] != 0)
            return ar[s - 1][t - 1];
        int result;
        if (S.charAt(s - 1) == T.charAt(t - 1))
            result = 1 + LCA(S, s - 1, T, t - 1);
        else
            result = Math.max(LCA(S, s - 1, T, t), LCA(S, s, T, t - 1));
        ar[s - 1][t - 1] = result;
        return result;
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
