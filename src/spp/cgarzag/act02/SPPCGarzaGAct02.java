/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cgarzag.act02;
import java.util.*;
/**
 *
 * @author Carlos Rafael
 */
public class SPPCGarzaGAct02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           double base, altura,sup,per;
       //Llamar a scanner
       
       Scanner entrada = new Scanner(System.in);
       //Pedir datos
        System.out.println("Favor de ingresar la base");
         base=entrada.nextDouble();
        System.out.println("Favor de ingresar la altura");
         altura=entrada.nextDouble();
        //Procedimiento1
          sup=(base*altura);
        //Resultado1
        System.out.println("La superficie del rectangulo es: " + sup);
        //Procedimiento 2
          per=((base*2)+ (altura*2));
        //Resultado 2
        System.out.println("El perímetro del rectangulo es: " + per);
          
         
         
       
       
    }
    
}



