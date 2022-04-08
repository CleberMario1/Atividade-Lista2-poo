package imovel;


public class Novo extends Imovel{
    protected double precoAdicional = 1000;

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
    
    public double imprimeNovo(){
        return this.preco + this.precoAdicional;
        
        
        
    }
    public static void main(String[] args) {
        Novo n1 = new Novo();
        System.out.println("Com o valor adicional, o preço fica R$" + n1.imprimeNovo());
    }
}
