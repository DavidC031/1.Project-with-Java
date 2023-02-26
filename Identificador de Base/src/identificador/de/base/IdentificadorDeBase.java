/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificador.de.base;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class IdentificadorDeBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        long Ti, Tf;
        int b=0;
        System.out.println("Digite el resultado");
        int n = lector.nextInt();
        int a = 2;
        BigInteger res = BigInteger.ONE;
        Ti = System.nanoTime();
        for (int i = 700; i <= 800; i++) {
            for (int j = 50; j <= 90; j++) {
             b=i*j;
              
            }
               res = res.multiply(BigInteger.valueOf(a));
        }
        Tf = System.nanoTime();
        System.out.println(a + "^" + n + " = " + res);
        System.out.println("Tiempo: " + (Tf - Ti)); // TODO code application logic here
    }
    
}
