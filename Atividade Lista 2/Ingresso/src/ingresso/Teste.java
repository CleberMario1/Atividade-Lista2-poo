package ingresso;

import java.util.Scanner;


public class Teste {
    public static void main(String[] args) {
        Ingresso i1 = new Ingresso();
        Scanner i2  = new Scanner(System.in);
        CamaroteSuperior c1 = new CamaroteSuperior();
        CamaroteInferior ci1 = new CamaroteInferior();
        System.out.println("Escolha o seu ingresso!\n"
                + "digite 1 para o ingresso normal\n"
                + "digite 2 para o ingresso VIP");
        int opcao = i2.nextInt();
        if(opcao == 1){
            System.out.println("o valor do ingresso é R$ "+ i1.valor);
            
        }else if(opcao == 2){
            System.out.println("digite 1 para o Camarote Superior\n"
                    + "digite 2 para o Camarote Inferior");
             opcao = i2.nextInt();
          if(opcao == 1){
              System.out.println("Camarote Superior "
                      + "valor R$ " + c1.retornaValor()) ;
          }else if(opcao == 2){
              System.out.println("Camarote Inferior"
                      + " valor R$ " + ci1.imprimeValor());
              
          }       
        }
        
    }
}
