/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author rtill
 */
public class coinCounterTest {
    
    @Test
    public void testAscendingOrder() {
        System.out.println("Test 4");
        int[] currency = {1,5,10,25};
        int[] returns= {25,10,5,1};
        assertArrayEquals(returns, coinCounter.coinCounter(currency, 41));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray() {
        System.out.println("Test 1");
        int[] currency = {};
        int[] returns= {25,10,5,1};
        assertArrayEquals(returns, coinCounter.coinCounter(currency, 41));
    }
    
    
    @Test
    public void testDecendingOrder() {
        System.out.println("Test 2");
        int[] currency = {25,10,5,1};
        int[] returns= {25,10,5,1};
        assertArrayEquals(returns, coinCounter.coinCounter(currency, 41));
    }
    
    @Test
    public void testMixedOrder() {
        System.out.println("Test 3");
        int[] currency = {5,25,1,10};
        int[] returns= {25,10,5,1};
        assertArrayEquals(returns, coinCounter.coinCounter(currency, 41));
    }
    
    
}
