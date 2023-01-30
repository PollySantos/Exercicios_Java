package Projeto_Ônibus;

public class T001_Tela_estática {
    public static void main(String[] args) {
        String NomeEmpresa;
        String Telefone;
        String Email;
        int AnoAtual;
        String PrecoPassagem;

        NomeEmpresa = "TARGET TUR";
        AnoAtual = 2023;
        Telefone = "(51) 11223-344";
        Email = "vendas@targettur.com";
        PrecoPassagem = "R$ 100,20";

        System.out.print(" \n");
        System.out.print("========================================================\n");
        System.out.print(" SISTEMA PARA EMPRESA DE ÔNIBUS - Ano atual: 2023\n");
        System.out.print("========================================================\n");
        System.out.print(" \n");
        System.out.print("BEM-VINDO!\n");
        System.out.print("Compre suas passagens pelo telefone: " + Telefone);
        System.out.print(" \n");
        System.out.print("Ou entre em contato pelo e-mail: " + Email);
        System.out.print(" \n");
        System.out.print("Preço da passagem: " + PrecoPassagem);
        System.out.print(" \n");
        System.out.print(" \n");
        System.out.print("========================================================\n");
        System.out.print("Construido por PollySantos\n");
        System.out.print("========================================================");
        System.out.print(" \n");
    }
}
