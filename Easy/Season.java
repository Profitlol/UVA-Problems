
package season;
import java.util.*;
import java.math.BigInteger;
/**
 *
 * @author Steven
 * UVA 424 Integer inquiry
 * Used BigInteger Class
 */
public class Season {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger zero = BigInteger.valueOf(0);
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0;i < 100; i++)
        {
            BigInteger a = in.nextBigInteger();
            if(a.equals(zero)) break;
            sum = sum.add(a);
        }
        System.out.println(sum.toString());
    }
    
}
