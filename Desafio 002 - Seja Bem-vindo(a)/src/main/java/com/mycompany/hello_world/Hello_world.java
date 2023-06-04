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
        Scanner sc = new Scanner(System.in);
        
        String nome;
        System.out.print("Por Favor, Digite o Seu Nome: ");
        nome = sc.nextLine();
        System.out.println("Olá " + nome + " !!!" + " Seja Bem-vindo(a).");
    }
}