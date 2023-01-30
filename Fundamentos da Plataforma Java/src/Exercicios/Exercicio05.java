//Construa um algorítimo que: Pergunte ao usuário o ano de nascimento e mostre na tela sua idade.

package Exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int idadeUsuario = 0;
        int anoAtual = 0;
        LocalDate current_date = LocalDate.now();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu ano de nascimento ?.");
        idadeUsuario = sc.nextInt();
        if (idadeUsuario <= 0) {
            System.out.println("Ano invalido.");
        } else {
            double result = current_date.getYear() - idadeUsuario;
            System.out.println("Você tem " + result + " anos");
        }
    }
}



