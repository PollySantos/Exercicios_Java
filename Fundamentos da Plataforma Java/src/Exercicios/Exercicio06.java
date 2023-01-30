/* Construa um algorítimo que pergunte ao usuário quantos KM seu carro percorre por litro
e mostre a quilometragem que irá andar com 20 litros.
*/

package Exercicios;


import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int kmLitro = 0;
        int litro = 0;

        System.out.println("Quatos km seu carro percorreu com 1 litro de gasolina?");
        litro = ler.nextInt();

        kmLitro = litro * 20;

        System.out.println("Seu carro percorre " + kmLitro + "com 20 litros de gasoliina");

    }
}