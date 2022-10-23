/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args){
        
        Scanner teclado=new Scanner(System.in);
        
        byte hora;
        
        System.out.print("Que hora es? ");
        hora = teclado.nextByte();
        
        if ((hora > 5)&&(hora < 13)) {
            System.out.println("Buenos dias");
        }
        else if ((hora > 12)&&(hora < 21)){
            System.out.println("Buenas tardes");
        }
        else if (((hora > 20)||(hora < 5))&&(hora < 25)) {
            System.out.println("Buenas noches");
        }
        else {
            System.out.println("Introduzca una hora valida");
        }
                
    }
    
}
