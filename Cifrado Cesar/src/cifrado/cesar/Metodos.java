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
public class Metodos {
  private String cadena;
 
    public Metodos(String cadena){
        this.cadena = cadena;
    }
    public String cifrarCadena(){
        return traducirCadena("cifrar");
    }
 
    public String descifrarCadena(){
        return traducirCadena("descifrar");
    }
 
    private String traducirCadena(String operacion){
        String cadenaCifrada = "";
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.toLowerCase().charAt(i);
            if(caracter>=97 && caracter<=122){
                if(operacion.equals("cifrar")){
                    if(caracter>='x'){
                        caracter = (char)('a' + ('z'-caracter));
                    }else{
                        caracter+=1;
                    }
                    cadenaCifrada+=(char)(caracter);
                }else{
                    if(caracter<='c'){
                        caracter = (char)('z' - (caracter -'a'));
                    }else{
                        caracter-=1;
                    }
                    cadenaCifrada+=(char)(caracter);
                }
            }else{
                cadenaCifrada+=caracter;
            }
        }
 
        cadena = cadenaCifrada;
        return cadena;
    }
}// TODO code application logic here
      

