/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=0;
        System.out.println("digite n"+n);
        System.out.println(factorial(500));
    }
    public static BigInteger factorial(int N)
    {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;
    }
}
