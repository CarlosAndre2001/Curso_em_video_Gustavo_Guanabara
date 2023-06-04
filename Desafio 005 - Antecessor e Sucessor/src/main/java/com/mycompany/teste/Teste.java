package com.mycompany.teste;

import java.util.Scanner;

public class Teste{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a; 
        
        System.out.println("Digite um Valor inteiro.");
        
        a = Integer.parseInt(sc.nextLine());
        
        System.out.println("Antecessor: " + (a-1));
        System.out.println("Sucessor: " + (a+1));
    }
}