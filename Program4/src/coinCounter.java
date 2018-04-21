/**
 *
 * @author rtill
 */


public class coinCounter{
  
    
    public static int  makeChange(int[] currencyIn, int value, int[] minCoins, int[] coinUsed)
    {
        if(currencyIn.length == 0)
        {
            throw new IllegalArgumentException("Array of size 0 is not allowed");
        }
        else
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
