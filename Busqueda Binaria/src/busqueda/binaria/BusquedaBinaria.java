/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda.binaria;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);

        int elemento[] = new int[8];
        System.out.println("Escribe 8 numeros");
        for (int i = 0; i < 8; i++) {
            elemento[i] = entra.nextInt();
        }

        System.out.println(" ingresa el numero a buscar");
        int numBuscar = entra.nextInt();
        long ti, tf;
        int n = elemento.length, inf = 0, centro = 0;
        int sup = n - 1;
        boolean bandera = false;
        ti = System.nanoTime();
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (elemento[centro] == numBuscar) {
                bandera = true;
                break;
            } else if (numBuscar < elemento[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        if (bandera == true) {
            System.out.println("El numero fue encontrado y estaba en la pos " + (centro + 1));
        } else {
            System.out.println("Numero no encontrado");
        }
        tf = System.nanoTime();

        System.out.println("Tiempo total" + (tf - ti));
    }
}
