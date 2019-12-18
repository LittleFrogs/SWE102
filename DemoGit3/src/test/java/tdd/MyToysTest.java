/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import Unit.MyToys;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MyToysTest {
    
     @Test
    // tu khoa nay - anotation giup bien 1 ham bat ki thanh psvm
    public void testSuccessCases(){
        //test tinh huong dua vao giai thua dung
        assertEquals(120, MyToys.computeFactoria(5));
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testfailCases(){
        //test tinh huong dua vao giai thua dung
        assertEquals(120, MyToys.computeFactoria(-5));
        
    }
}
