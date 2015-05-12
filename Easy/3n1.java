/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3n.pkg1;
import java.util.*;
import java.io.*;
/**
 *
 * @author Steven
 * UVA 100 3n + 1
 * 
 * Gotchas are 
 * b can be smaller than a
 * b can equal a
 * Order of a and b in output must be the same as the input, even when
 * b is smaller than a
 * 
 */
public class Main {

    private static int bigAssArray = 1000000;
    public static int[] store = new int[bigAssArray];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true); // boolean flush
        while(in.hasNextInt())
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int from = Math.min(a, b);
            int to = Math.max(a, b);
            int max = 0;
            
            for (int j = from; j <= to; j++)
            {
                max = Math.max(max, Cycle(j));
            }
            System.out.printf("%d %d %d\n", a, b, max);
        }          
    }
    
    public static int Cycle(long n)
    {
        if (n == 1)
            return 1;
        if (n< bigAssArray && store[(int)n] != 0)
			return store[(int)n];
		
		// computing length of collatz cycle 
		int len = 1 + Cycle(nextCollatz(n));
		
		// storing it in arr 
		if (n< bigAssArray)
			store[(int)n] = len;
		return len;
    }

    public static long nextCollatz(long n)
        {	
            if (n%2==0)
		return n/2;
            else 
		return n*3+1;
	}
    
}
