// leia dois valores reais e mostra a soma, a subtração, a multiplicação e a divisão destes dois valores.

package Exercicios;

import java.util.Scanner;
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float a, b;

        System.out.printf("Informe o primeiro valor: ");
        a = ler.nextFloat();

        System.out.printf("Informe o segundo valor.: ");
        b = ler.nextFloat();
        System.out.printf("\nResultados:\n");
        System.out.printf("\n%.2f + %.2f = %.2f\n", a, b, (a + b));
        System.out.printf("%.2f - %.2f = %.2f\n", a, b, (a - b));
        System.out.printf("%.2f * %.2f = %.2f\n", a, b, (a * b));
        System.out.printf("%.2f / %.2f = %.2f\n", a, b, (a / b));
    }
}