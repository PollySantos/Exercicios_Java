/*Faça um algoritmo que leia um número inteiro e mostre uma mensagem informando
se o número é menor, igual ou maior que 10.
 */

package Exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio08 {
    public static void main(String[] args) {
        // Inicializa as variáveis
        int menor = Integer.MAX_VALUE;
        int maior = 0;


        // Obtém a entrada do teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Looping para s 3 números
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            int readed = 0;
            try {
                readed = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            // Verifica se o número é o menor
            if (readed < menor) {
                menor = readed;
            }
//          Verifica se o número é o maior
            if (readed > maior) {
                maior = readed;
            }
        }
        // Imprime os resultados
        System.out.println("O " + menor + " é menor do que 10");
        System.out.println("O " + maior + " é maior do que 10");
    }
}
