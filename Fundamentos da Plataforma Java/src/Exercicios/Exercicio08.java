package Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String args[]) {
            Scanner teclado = new Scanner(System.in);
            long vec[] = new long[10];
            long maior = Integer.MIN_VALUE, // Menor valor, porque qualquer valor vai ser maior que ele;
                    menor = Integer.MAX_VALUE, // Maior valor, porque qualquer valor vai ser menor que ele;
                    media = 0;
            for(int x = 0; x < vec.length; x++){
                System.out.println("Digite o " + (x + 1) + "º de " + vec.length + " números:");
                vec[x] = teclado.nextLong();
                media += vec[x];
                if(vec[x] < menor){
                    menor = vec[x];
                }
                if(vec[x] > maior){
                    maior = vec[x];
                }
            }
            System.out.println("O maior número digitado foi: " + maior + ";\n" +
                    "O menor número digitado foi: " + menor + ";\n" +
                    "A média dos números digitados foi: " + (media / vec.length) + ".");

    }
}
