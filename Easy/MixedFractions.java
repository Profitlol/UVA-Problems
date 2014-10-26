package mixedfractions;
import java.util.*;
/**
 *
 * @author Steven
 */
public class MixedFractions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
        {            
            int num = in.nextInt();
            int dom = in.nextInt();
            if ((num == 0)&&(dom==0))
                    break;
            int bignum = num/dom;
            int mod = num%dom;
            System.out.printf("%d %d / %d\n", bignum, mod, dom);        
        }
        
    }
    
}
