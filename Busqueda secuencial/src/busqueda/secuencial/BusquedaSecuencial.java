/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package busqueda.secuencial;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BusquedaSecuencial {
     static BufferedReader br = null;
    static String N= "";
    static int n=0;
    static String[] Nombre = new String[50];
    static String[] APaterno = new String[50];
    static String[] AMaterno = new String[50];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       br = new BufferedReader(new InputStreamReader(System.in));
 
        do{
            menu();
        }while(Integer.parseInt(N)!=4);
    }
 
    public static void menu(){
         do{
            System.out.println("Selecciona una de las opciones del menú: \n "
                                    + "1- INSERTAR \n "
                                    + "2- CONSULTAR "
                                    + "\n 3- ELIMINAR \n "
                                    + "4- FINALIZAR");
            try{
                 N = br.readLine();
            }catch(Exception e){
                e.printStackTrace();
            }
        }while(!esEntero(N) || conversor(N)<=0 || conversor(N)>=5 );
 
         switch(Integer.parseInt(N)){
            case 1:
                insertar();
                break;
            case 2:
                consultar();
                break;
            case 3:
                eliminar();
                break;
            case 4:
                imprimir();
                break;
        }
    }
 
    public static void consultar(){
        if(n>0){
            String nombre="";
            int eureka=0;
 
            try{
                    System.out.println("Ingresa el Nombre : ");
                    nombre = br.readLine();
                }catch(Exception e){
                    e.printStackTrace();
                }
 
            for(int i=0; i<n; i++){
                if(Nombre[i].equals(nombre)){
                    eureka=1;
                }
            }
            if(eureka==1){
                System.out.println("Nombre encontrado!!!!!. ");
            }else{
                System.out.println("Nombre NO localizado!!!!!. ");
            }
        }
        else{
            System.out.println("No hay elementos en la lista. ");
        }
 
    }
 
    public static boolean esEntero(String cad) {
        for(int i = 0; i<cad.length(); i++)
            if( !Character.isDigit(cad.charAt(i)) )
        return false;
 
        return true;
    }
 
    public static int conversor(String x){
        int valor=0;
 
        try{
            valor= Integer.parseInt(x);
        }catch(NumberFormatException e){
            System.out.println("Valor invalido");
        }
 
        return valor;
    }
 
    public static void insertar(){
 
            if(n<50){
                System.out.println("Leyendo datos de la persona: " + (n+1));
 
            try{
                 System.out.println("Ingresa el Apellido Paterno: ");
                 APaterno[n] = br.readLine();
            }catch(Exception e){
                e.printStackTrace();
            }
 
            try{
                System.out.println("Ingresa el Apellido Materno: ");
                AMaterno[n] = br.readLine();
            }catch(Exception e){
                e.printStackTrace();
            }
 
            try{
                 System.out.println("Ingresa el nombre: ");
                 Nombre[n] = br.readLine();
            }catch(Exception e){
                e.printStackTrace();
            }
 
            n++;
            }else{
                System.out.println("El vector esta lleno, elimina personas para poder insertar");
            }
 
    }
 
    public static void eliminar(){
            String nombre="";
            int encontrados=0;
 
        if(n>0){
 
            try{
                    System.out.println("Ingresa el Nombre : ");
                    nombre = br.readLine();
                }catch(Exception e){
                    e.printStackTrace();
                }
 
            for(int i=0; i<n; i++){
                if(Nombre[i].equals(nombre)){
                    encontrados++;
                    for(int j=i; j<n; j++){
                        Nombre[j]=Nombre[j+1];
                        APaterno[j]=APaterno[j+1];
                        AMaterno[j]=AMaterno[j+1];
                    }
                    i--;
                    n--;
                }
            }
            if(encontrados>0){
                System.out.println("Nombre encontrado, procediendo a eliminar!!!!!. ");
            }else{
                System.out.println("Nombre NO localizado!!!!!. ");
            }
        }else{
            System.out.println("No hay elementos a eliminar.");
        }
 
    }
 
    public static void imprimir(){
        if(n>0){
            System.out.println("Apellido paterno  Apellido Materno   Nombre");
            for(int i=0; i<n; i++){
                System.out.print(i+1 + ".- " + APaterno[i] + "\t");
                System.out.print(AMaterno [i] + "\t        ");
                System.out.print(Nombre [i] + ".");
                System.out.println();
            }
        }
    } // TODO code application logic here
    }
    

