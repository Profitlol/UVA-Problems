/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcfactorial;
import java.util.*;
import java.math.BigInteger;

/**
 *
 * @author Steven
 * UVA 623 - 500!
 * Calculate the factorial of given # input
 * 
 * Gotchas include: 
 * input limit of N = 1000
 * 0! = 1
 */
public class CalcFactorial 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        BigInteger[] calcs = new BigInteger[1001]; // taking care of limit
        calcs[0] = BigInteger.ONE; // creates constant 1
        // this loop calculates N! 
        for (int i = 1; i < calcs.length; i++)
        {
            calcs[i] = calcs[i -1].multiply(new BigInteger(i + ""));
            //1, 2, 6, 24, 120, 720
            //1!, 2!, 3!, 4!, 5!, 6!
            //System.out.println(calcs[i]); this is stupid
        }
        while (in.hasNextInt())
        {
            int n = in.nextInt();
            System.out.println(n + "!");
            System.out.println(calcs[n]);
        }
    }
    
}
