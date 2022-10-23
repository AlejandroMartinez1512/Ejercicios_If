/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga;
import java.util.Scanner;


public class Ejercicio3 {
    
     public static void main(String[] args){
         
         Scanner teclado=new Scanner(System.in);
         
         int horas;
         int extras;
         double pago;
         
         System.out.print("Cuantas horas ha trabajado? ");
         horas = teclado.nextByte();
         System.out.println("Ha trabajado "+horas+" horas");
         
         if (horas <= 40) {
             pago = horas * 15;
             System.out.println("Su retribucion sera de "+pago+"$");
         }
         else if (horas > 40) {
             extras = horas - 40;
             pago = (40 * 15) + (extras * 20);
             System.out.println("Su retribucion sera de "+pago+"$");
         }
         else {
             System.out.println("Introduzca un valor valido");
         }
         
     }
    
}
