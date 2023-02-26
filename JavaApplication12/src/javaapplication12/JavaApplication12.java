/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class JavaApplication12 {
int k=35;
    /**
     * @param args the command line arguments
     */
    public class Fibonacci
    {
    // Returns n-th Fibonacci number
     static BigInteger fib(int n){
         
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            a = b;
            b = c;
        }
  
        return (b);
    }
  
    }

    public static void main(String[] args) {
       int n = 100;
        System.out.println("Fibonacci of " + n +
            "th term" + " " +"is" +" " + fib(n));  // TODO code application logic here
    }
    
}
