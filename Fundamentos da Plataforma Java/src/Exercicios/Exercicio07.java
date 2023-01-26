package Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double cargaMensal = 0;
        double salario = 0;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Qual sua carga mensal de trabalho ?.");
        cargaMensal = sc2.nextInt();

        System.out.println("Qual seu salario mensal ?.");
        salario = sc2.nextInt();

        if (cargaMensal <= 0 || salario <= 0) {
            System.out.println("Os valores preenchidos são invalidos !");
        } else {
            double result = salario / cargaMensal;
            System.out.println("O valor da sua hora de trabalho é R$ " + result + " reais.");
        }

    }
}
