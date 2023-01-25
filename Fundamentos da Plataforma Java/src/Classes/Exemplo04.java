package Classes;

public class Exemplo04 {
    public static void main (String [] args) {
        String primeiroNome = "Poliana";
        String segundoNome = "Santos";
        String nomeCompleto = nomeCompelto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompelto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ");
    }
}
