package parking;

import java.util.*;

/**
 *
 * @author struo_000
 */
public class Parking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> store = new ArrayList<Integer>();
        int cases = scan.nextInt();
        while (cases >= 1 && cases < 101) 
        {
            int subcase = scan.nextInt();
            if (subcase >=1 && subcase < 21) 
            {
                for (int i = 0; i < subcase; i++) 
                {
                    int num = scan.nextInt();
                    if (num >=0 && num <= 99) 
                    {
                        store.add(num);
                    }
                }
            }
            Collections.sort(store);
            int min = store.get(0);
            int max = store.get(store.size() - 1);
            //System.out.println(max +" this is max");
            int dist = 2 * (max - min);
            System.out.println(dist);
            store.clear();
            cases--;
        }
    }

}
