
package autostrada;

/**
 *
 * @author Bryant Sarabia
 */
public class Tariffa {
    private String classe;
    private double prezzo;

    public Tariffa(String classe, double prezzo) {
        this.classe = classe;
        this.prezzo = prezzo;
    }

    public String getClasse() {
        return classe;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    
    
}
