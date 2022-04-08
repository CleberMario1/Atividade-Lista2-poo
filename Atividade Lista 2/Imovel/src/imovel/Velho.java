package imovel;

public class Velho extends Imovel {
    protected double descontoPreco = 2000;

    public double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }
    
    public double imprimeVelho(){
        return this.preco - this.descontoPreco;
    }
    public static void main(String[] args) {
            Velho v1 = new Velho();
            System.out.println("Com o desconto, o preço fica R$"  + v1.imprimeVelho());
    }
}
