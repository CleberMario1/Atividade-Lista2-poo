package ingresso;


public class VIP extends Ingresso {
    protected double valorVIP = 30;
    
    public double ingressoVIP(){
        return valorVIP + this.valor;
    }
    
       
}
