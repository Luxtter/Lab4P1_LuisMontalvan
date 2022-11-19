/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_luismontalvan;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author luism
 */
public class Lab4P1_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pochita= new Scanner(System.in);//utilizado para variables int
        Scanner lelouch= new Scanner(System.in);//utilizado para variables string
        OUTER:
        do{
            int numRan= new Random().nextInt(((10-1)+1)+1);
            System.out.print("-------Menu------- \n1)Fallout words \n2)Rodatcripne \n3)Alpha \n4)Salir \nPorfavor ingrese una opcion: ");
            int opc= pochita.nextInt();
            
            switch(opc){
                case 1:
                    //1
                    do{
                       System.out.println("-------1------- \nAdivine cual de las siguientes palabaras es la correcta para hackear el sistema: \n1)Comer     6)Unida \n2)Jugar     7)Venti \n3)Salta     8)Llama \n4)Llora     9)Eevee \n5)Muere     10)Local");
                        //no esta terminado le falta las pistas y que sea mas amistoso
                        int opcSeleccionada= pochita.nextInt();
                        boolean acceso= resp(opcSeleccionada,numRan);
                        System.out.println(numRan);
                        if(acceso==true){
                            break;
                        }
                    }while(true);
                    
                    break;
                case 2:
                    //2
                    System.out.print("-------2------- \nIngrese su contaseña: ");
                    String contraseña= lelouch.nextLine();
                    System.out.println(contraseña);
                    String password= rodatcripne(contraseña);
                    System.out.println(password);
                    
                    break;
                case 3:
                    //Alpha
                    soloLetras();
                    break;
                case 4:
                    //salir
                    break OUTER;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(true);
        
        
    }
    public static boolean resp(int seleccion, int correcta){
        if(seleccion == correcta){
            System.out.println("Acceso concedido");
            boolean resp= true;
            return resp;
        }else{
            boolean resp= false;
            
            return resp;
        }
    
    }
    
    public static String rodatcripne(String password){
        System.out.println(password);
        password= password.toLowerCase();
        int largo= password.length();
        for(int i=0;i<largo;i++){
           
            char chara1= password.charAt(i);
            char chara2= password.charAt(largo-i);
            
            password= password.replace(chara1, chara2);
        }
        return password;
    }
    public static int chartoint(char charAt){
        int a= charAt;
        return a;
                
        
    }
    public static void soloLetras(){
        Scanner lelouch= new Scanner(System.in);
        System.out.print("-------Alpha-------\nIngrese la cadena que desea evaluar: ");
        String cadena= lelouch.next();
        int largo= cadena.length();
        
        int bandera= 0;
        for(int i=0; i< largo;i++){
            char chara= cadena.charAt(i);
            int letra= chartoint(chara);
            if ((letra>96 && letra<122)||(letra>64 && letra<91)){
                bandera=bandera;
            }else{
                bandera=1;
            }
            
        }
        if (bandera == 1){
            System.out.println("La cadena contiene caracteres que no son letras");
        }else{
            System.out.println("La cadena solo contiene letras");
        }
    }
}
