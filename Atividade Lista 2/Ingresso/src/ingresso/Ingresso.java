package ingresso;

public class Ingresso {
    protected double valor = 15;
    
    public double imprimeValor(){
        return valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public static void main(String[] args) {
        Ingresso i1 = new Ingresso();
        VIP v1 = new VIP();
        System.out.println(v1.ingressoVIP());
        
    }
    
}
