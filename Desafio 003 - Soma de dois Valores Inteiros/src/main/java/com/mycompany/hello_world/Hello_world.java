/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hello_world;
import java.util.Scanner;
/**
 *
 * @author Carlos André
 */

public class Hello_world {

   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       
       int a,b,x;
       
       System.out.print("Digite o Primeiro Valor: ");
       a=Integer.parseInt(s.nextLine());
       System.out.print("Digite o Segundo Valor: ");
       b=Integer.parseInt(s.nextLine());
       
       x = a + b;
       
       System.out.println("A Soma dos Valores é: " + x);
       
   }
}