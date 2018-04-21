/**
 *
 * @author rtill
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class coinCounter{
   /*   public static void main(String[] args) {
        int[] test;
        int[] sendin = {25,10,5,1};
         test = coinCounter.coinCounter(sendin, 73);
        
//          for (int i = 0; i < test.length; i++) {
//               System.out.println(test[i]);
//          }
//         
      }
*/
    
    
    public static int[] coinCounter(int[] currencyIn, int value)
    {
        int[] currencyReturn = new int[4];
        Arrays.sort(currencyIn);
        ArrayUtils.reverse(currencyIn);
            
        if(currencyIn.length == 0)
        {
            throw new IllegalArgumentException("Array of size 0 is not allowed");
        }
        else
        {
            // System.out.print("The smallest count count to achieve " + value + " is the following coins: ");
            for(int i=0; i<currencyIn.length; i++)
             {
                int x = currencyIn[i];
                while(value >= x)
                {
                 value = value - x;
                 currencyReturn[i]=x;
                 // System.out.print(x + " ");
                }
            }   
        }
        return currencyReturn;
    }
}
