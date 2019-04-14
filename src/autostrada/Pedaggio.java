package autostrada;
import veicolo.veicolo;
/**
 *
 * @author Bryant Sarabia
 */
public class Pedaggio implements Percorso {
    private double iva = 0.22;
    private double pianura = 0.02;
    private double montagna = 0.05;
    private double cost;
    
    @Override
    public  double getDistanza(Casello c1, Casello c2) {
	double distanza;
        
        if(c1.getDistanzaInizio() < c2.getDistanzaInizio()){ 
               distanza = c2.getDistanzaInizio()-c1.getDistanzaInizio();
	}
	else{
		distanza = c1.getDistanzaInizio()-c2.getDistanzaInizio();
	}
	    		return distanza;

}
    
    
    public  double getCosto(veicolo v,Autostrada n,String caselloPartenza,
            String caselloArrivo){
        
        double x = Autostrada.getTariffaUnitaria(v);

        Casello partenza = Autostrada.getCasello(caselloPartenza);
        Casello arrivo = Autostrada.getCasello(caselloArrivo);
        double distanza = getDistanza(partenza,arrivo);
        double cost = (x * distanza);
        x = cost * this.iva;
        cost = cost + x;
        if(n.getTipo_autostrada()==true){
            x = cost * this.montagna;
            cost+=x; //Montagna
        }
        else {
             x = cost * this.montagna;
            cost+= this.pianura; //Pianura
        }
        return cost;
    }
    public void setIva(double iva) {
		this.iva = iva;
	}
	public double getIva() {
		return this.iva;
}

    public void setPianura(double pianura) {
        this.pianura = pianura;
    }

    public void setMontagna(double montagna) {
        this.montagna = montagna;
    }

    public double getPianura() {
        return pianura;
    }

    public double getMontagna() {
        return montagna;
    }

    public double getCost() {
        return cost;
    }
    
    
        
}
