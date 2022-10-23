/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args){
        
        Scanner teclado=new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        
        System.out.println("Introduce el primer numero: ");
        num1 = teclado.nextByte();
        System.out.println("Introduce el segundo numero: ");
        num2 = teclado.nextByte();
        System.out.println("Introduce el tercer numero: ");
        num3 = teclado.nextByte();
        
        if ((num1 < num2)&&(num1 < num3)) {
            if (num2 < num3) {
                System.out.println(num1+", "+num2+", "+num3);
            }
            else {
                System.out.println(num1+", "+num3+", "+num2);
            }
        }
        else if ((num2 < num1)&&(num2 < num3)) {
            if (num1 < num3) {
                System.out.println(num2+", "+num1+", "+num3);
            }
            else {
                System.out.println(num2+", "+num3+", "+num1);
            }
        }
        else if ((num3 < num1)&&(num3 < num2)) {
            if (num1 < num2){
                System.out.println(num3+", "+num1+", "+num2);
            }
            else {
                System.out.println(num3+", "+num2+", "+num1);
            }
        }
        
    }
    
}
