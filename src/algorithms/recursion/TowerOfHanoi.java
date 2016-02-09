/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.recursion;

public class TowerOfHanoi
{
    private static int count = 0;
    
    public static void main(String[] args)
    {
        int n = 20;
        new TowerOfHanoi().solve(n, 'A', 'C', 'B');
        System.out.println(count);
    }
    
    void solve(int n, char from, char to, char aux)
    {
        count++;
        if (n == 1)
        {
            System.out.println(from + "--" + to);
            return;
        }
        solve(n - 1, from, aux, to);
        System.out.println(from + "--" + to);
        solve(n - 1, aux, to, from);
        
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
