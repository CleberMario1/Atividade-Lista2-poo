
package ingresso;


public class CamaroteSuperior extends VIP{
    protected double valorSuperior = 60;

    public double getValorSuperior() {
        return valorSuperior;
    }

    public void setValorSuperior(double valorSuperior) {
        this.valorSuperior = valorSuperior;
    }
    
    public double retornaValor(){
        this.valorSuperior += this.valorVIP + this.valorVIP;
        return this.valorSuperior;
    }
    
}
