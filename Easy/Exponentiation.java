
package exponentiation;
import java.util.Scanner;
import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.math.MathContext;
/**
 *
 * @author Steven
 * UVA 748 Exponentiation
 * This is kind of a lesson of moving pointers & BigInt/BigDecimal
 * The calculation R^n can be done in either BigInt or String
 * 
 * Probably first thing to do is calculate the R^n then see how they handle
 * the exceptions.
 */
public class Exponentiation {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
//        int low, high;
        while(in.hasNext())
        {
            BigDecimal r = in.nextBigDecimal();
            int n = in.nextInt();
            //toPlainString() will never use scientific notation
            //toString() maybe use scientific notation
            r = r.pow(n);
            //wtf there is a stripTrailingZeros() function
            String out = r.stripTrailingZeros().toPlainString();
//            low = 0;
//            // these while loops handle the 0.numbers case
//            // increases the index so the front 0 does not get printed
//            //while(sum.charAt(low)=='0')
//            {
//                //System.out.print(low +", ");
//                low++;
//            }
//            high = sum.length()-1;
//            //System.out.println(sum);
//            //System.out.println(high);
//            //  1.0100 12
//            //  1.126825030131969720661201000000000000000000000000
//            //  Period excluded & 49th number = 0
//            //  We keep going down until we get a non 0 number
//            while(sum.charAt(high)== '0')
//            {
//                //System.out.print(high +", ");
//                high--;
//            }
            if(out.charAt(0)=='0')
                out=out.substring(1,out.length());
            System.out.println(out);
//            for(int i = low; i <= high; i++)
//                System.out.print(sum.charAt(i));
//            System.out.println();
        } 
    } 
}
