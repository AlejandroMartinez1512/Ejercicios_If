/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args){
        
        Scanner teclado=new Scanner(System.in);
        
        byte dia;
        
        System.out.print("Que numero de día de la semana es? ");
        dia=teclado.nextByte();
        
        if (dia == 1) {
            System.out.println("Es Lunes");
        }
        else if (dia == 2) {
            System.out.println("Es Martes");
        }
        else if (dia == 3){
            System.out.println("Es Miercoles");
        }
        else if (dia == 4) {
            System.out.println("Es Jueves");
        }
        else if (dia == 5) {
            System.out.println("Es Viernes");
        }
        else if (dia == 6){
            System.out.println("Es Sabado");
        }
        else if (dia == 7) {
            System.out.println("Es Domingo");
        }
        else {
            System.out.println("Introduzca un valor valido");
        }
        
        
        
        
    }
    
}
