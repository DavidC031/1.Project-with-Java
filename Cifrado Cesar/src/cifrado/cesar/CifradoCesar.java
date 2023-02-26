/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado.cesar;

/**
 *
 * @author User
 */
public class CifradoCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos cc = new Metodos("Norte");
        System.out.println(cc.cifrarCadena());
        System.out.println(cc.descifrarCadena());
    }
    
}
