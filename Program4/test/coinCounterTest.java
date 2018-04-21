/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;



public class coinCounterTest {
    
    @Test
    public void testCase21() {
        System.out.println("Test 4");
        int[] currency = {1,5,10,21,25};
        int value = 63;
        int[] coinsUsed = new int[value+1];
        int[] coinsCount = new int[value+1];
        int compare = 3;
        assertEquals(compare, coinCounter.makeChange(currency, value, coinsCount, coinsUsed));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray() {
        System.out.println("Test 1");
        int[] currency = {};
        int value = 63;
        int[] coinsUsed = new int[value+1];
        int[] coinsCount = new int[value+1];
        int compare = 3;
        assertEquals(compare, coinCounter.makeChange(currency, value, coinsCount, coinsUsed));
    }
    
    
    @Test
    public void testCase50() {
        System.out.println("Test 2");
        int[] currency = {1,5,10,25};
        int value = 50;
        int[] coinsUsed = new int[value+1];
        int[] coinsCount = new int[value+1];
        int compare = 2;
        assertEquals(compare, coinCounter.makeChange(currency, value, coinsCount, coinsUsed));
    }
    @Test
    public void testCase16() {
        System.out.println("Test 3");
        int[] currency = {1,5,10,25};
        int value = 16;
        int[] coinsUsed = new int[value+1];
        int[] coinsCount = new int[value+1];
        int compare = 3;
        assertEquals(compare, coinCounter.makeChange(currency, value, coinsCount, coinsUsed));
    }
}

