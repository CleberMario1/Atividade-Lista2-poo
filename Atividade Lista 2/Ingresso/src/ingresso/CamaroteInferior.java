package ingresso;


public class CamaroteInferior extends VIP{
    protected double lugar = 45;

    public double getLugar() {
        return lugar;
    }

    public void setLugar(double lugar) {
        this.lugar = lugar;
    }
    
    @Override
    public double imprimeValor(){
       return this.valor + this.valorVIP + this.lugar;
    }
            
    public double imprimelugar(){
        return this.lugar;
         
    }
}
