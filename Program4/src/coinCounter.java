/**
 *
 * @author rtill
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class coinCounter{
      public static void main(String[] args) {
        int value = 63;
        int[] coins = {1,5,10,21,25};
        int[] coinsUsed = new int[value+1];
        int[] coinsCount = new int[value+1];
        
         System.out.print("Making change for " + value + " requires \n");
         System.out.println( makeChange(coins, value, coinsCount, coinsUsed) + " coins");
         System.out.print("They are, ");
         Print(coinsUsed, value);
         System.out.println("The used list is as follows");
         printArray(coinsUsed);
         
         
        
         
      }

    
    
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
    
    public static int  makeChange(int[] currencyIn, int value, int[] minCoins, int[] coinUsed)
    {
      
        for(int cents = 1; cents<value+1; cents++)
        {
            int coinCount = cents;
            int newCoin =1;
            for(int j = 0; j <currencyIn.length ; j++)
            {
                
                if(currencyIn[j] <= cents)
                {
                    if(minCoins[cents-currencyIn[j]]+1 < coinCount)
                    {
                        coinCount = minCoins[cents-currencyIn[j]]+1;
                        newCoin = currencyIn[j];
                    }
                }
            }
            minCoins[cents] = coinCount;
            coinUsed[cents] = newCoin;
    }
        return minCoins[value];
    }
    
    public static void Print(int[] coinUsed,int value)
    {
        int coin = value;
        while(coin > 0)
        {
            int thisCoin = coinUsed[coin];
            System.out.print(thisCoin + " ");
            coin = coin - thisCoin;
        }
    }
    
    public static void printArray(int[] coinUsed)
    {
        System.out.print("[");
        for(int x = 1; x < coinUsed.length; x++)
        {
            int thisCoin = coinUsed[x];
            System.out.print(thisCoin + ", ");
        }
        System.out.print("]");
    }
    
}
