/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogit2;

import Unit.*;

/**
 *
 * @author USER
 */
public class MyToys1 {
    public static int computeFactoria(int n){
        if(n < 0)
            throw new IllegalArgumentException("invalid argument. it must be >= 0");
        else 
        if(n == 0 || n == 1)
            return 1;
        else
            return computeFactoria(n - 1) * n;
}
}
