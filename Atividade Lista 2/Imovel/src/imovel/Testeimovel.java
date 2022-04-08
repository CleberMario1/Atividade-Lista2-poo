package imovel;

import java.util.Scanner;

public class Testeimovel {
    public static void main(String[] args) {
        Imovel i1 = new Imovel();
        Scanner i2 = new Scanner(System.in);
        Novo n1 = new Novo();
        Velho v1 = new Velho();
        System.out.println("Escolha o imóvel\n"
                + "digite 1 para novo\n"
                + "digite 2 para velho");
        int opcao = i2.nextInt();
        if(opcao == 1){
        System.out.println("o valor final do imóvel novo de é R$"+ n1.imprimeNovo());
        }else if(opcao == 2){
        System.out.println("O valor do imóvel velho é de R$"+ v1.imprimeVelho());
    }
}
}    