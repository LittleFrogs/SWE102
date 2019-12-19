/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MyToysTest {
    
    @Test
    public void testComputeFactorial() {
        assertEquals(120, Unit.MyToys.computeFactoria(6));
    }
}
