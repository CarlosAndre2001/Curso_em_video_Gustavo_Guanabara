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
    
    public static boolean Maiuscula(String algo, boolean maius){
         return algo != null && algo.matches("^[A-Z]*$");
    }
    
    public static boolean Minuscula(String algo, boolean minus){
         return algo != null && algo.matches("^[a-z]*$");
    }
    
     public static boolean isAlphaNumeric(String algo) {
        return algo != null && algo.matches("^[a-zA-Z0-9]*$");
    }
     
     public static boolean Capitalizada(String algo, boolean capitalizado){
          char ch;
          int count = 0;    
         for( int i = 0; i < algo.length(); i++){
          ch = algo.charAt(i);  
            
             if (i == 0){
                 if(Character.isUpperCase(ch)) {
                     count += 1;
                 }
             }else if (Character.isLowerCase(ch)){
                 count += 1;
             }
             if (count == algo.length()){
                 capitalizado = true;
             }
         }
         
   return capitalizado;
}
    public static boolean Alfabetico(String algo, boolean alfabeto){
         for( char c : algo.toCharArray() ){
           if(Character.isLetter(c)){
               alfabeto = true;
           }
        }
         return alfabeto;
    } 
    public static void main(String[] args){
        String algo;
        boolean alfabeto = false, capitalizado = false, minus = false, maius = false;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite Algo(Somente Teclado Americano, sem Ç ou QUALQUER LETRA ACENTUADA!!!): ");
        algo = sc.nextLine();
       
        System.out.println("O Tipo de Dado é: : " + algo.getClass().getSimpleName());
      
        System.out.println("Só tem espaços ? : " + algo.isBlank());
        
        System.out.println("Tem alguma letra do alfabeto ? : " + Alfabetico(algo, alfabeto));
        
        System.out.println("Tem algum Alfanumérico ? : " + isAlphaNumeric(algo));
        
        System.out.println("Está Capitalizado ? : " + Capitalizada(algo, capitalizado));
        
        System.out.println("Está somente em minúscula ? : " + Minuscula(algo, minus));
        
        System.out.println("Está somente em maiúscula ? : " + Maiuscula(algo, maius));
        
        }
        
}
