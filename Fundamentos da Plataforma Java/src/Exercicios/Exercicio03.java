//  escreva um algoritmo que leia o nome e o sobrenome de um usuário e mostre o resultado concatenado

package Exercicios;

public class Exercicio03 {
    public static void main (String [] args) {
        String primeiroNome = "Poliana";
        String segundoNome = "Santos";
        String nomeCompleto = nomeCompelto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompelto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
