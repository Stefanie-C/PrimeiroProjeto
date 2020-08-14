/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1308;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Stéfanie
 */
public class excecao {
    public static void main(String[] args) {
     metodo1();
        System.out.println("TERMINANDO O PROGRAMA...");
}
    
    public static void metodo1 (){
        System.out.println("Inicio do Método 1");
        metodo2();
        System.out.println("Fim do Método 1");
    }
    public static void metodo2 (){
        System.out.println("Inicio do Método 2!");
        
        Scanner leitor = new Scanner (System.in);
        
        try{
        String [] vetor = leitor.nextLine().split (" ");
        int posicao = leitor.nextInt ();
        
        System.out.println(vetor [posicao]);
    }
    
        catch(InputMismatchException e){
            System.out.println("Não existem indices com letras");
        }
        
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice inexistente");
        }
        
        System.out.println("Fim do Método 2!");
}
}