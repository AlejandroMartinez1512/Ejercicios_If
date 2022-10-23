/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga;
import java.util.Scanner;

public class Ejercicio4 {
    
     public static void main(String[] args){
         
         Scanner teclado=new Scanner(System.in);
         double nota1;
         double nota2;
         double nota3;
         double media;
         
         System.out.println("La primera nota fue: ");
         nota1 = teclado.nextDouble();
         System.out.println("La segunda nota fue: ");
         nota2 = teclado.nextDouble();
         System.out.println("La tercera nota fue: ");
         nota3 = teclado.nextDouble();
         
         media = (nota1 + nota2 + nota3) / 3;
         
         if (media < 5) {
             System.out.println("Su nota es "+media+": insuficiente");
         }
         else if ((media >= 5)&&(media < 6)) {
             System.out.println("Su nota es "+media+": suficiente");
         }
         else if ((media >= 6)&&(media < 7)) {
             System.out.println("Su nota es "+media+": bien");
         }
         else if ((media >= 7)&&(media < 8.5)) {
             System.out.println("Su nota es "+media+": notable");
         }
         else if (media >= 8.5) {
             System.out.println("Su nota es "+media+": sobresaliente");
         }
         else {
             System.out.println("Introduzca un valor valido");
         }
         
     }
    
}
