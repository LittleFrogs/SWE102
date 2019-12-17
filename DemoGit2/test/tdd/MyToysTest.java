/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static Unit.MyToys.computeFactoria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MyToysTest {
    
    @Test
    public void Test(){
        assertEquals(120, computeFactoria(5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testfailCases(){
        //test tinh huong dua vao giai thua dung
        assertEquals(120, computeFactoria(-5));
        
    }
    
    
}
