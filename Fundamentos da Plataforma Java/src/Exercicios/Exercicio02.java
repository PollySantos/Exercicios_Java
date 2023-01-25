// Escreva um algoritmo que pergunte o nome e a idade do usuário e escreva estes valores digitados pelo usuário em forma de cumprimento
//Ex: Bom dia João (concatene com o nome digitado)
//Sua idade é 49 (concatene com a idade digitada)
package Exercicios;
import java.util.Scanner;

public class Exercicio02 {
    static Scanner scan  = new Scanner (System.in);

    public static void main (String []args)
    {
        System.out.println("Informe seu nome");
        String nome = scan.next();

        System.out.println("Informe sua idade");
        int idade = scan.nextInt();

        System.out.printf("Bom dia %s \nSua idade é %d anos", nome,idade);
    }

}
