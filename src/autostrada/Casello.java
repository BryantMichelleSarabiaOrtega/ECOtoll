
package autostrada;

/**
 *
 * @author Bryant Sarabia
 */
public class Casello {
    private String nome_casello;
    private double distanza_dal_inizio;
	public Casello(String nome_casello, double distanza_dal_inizio) {
		this.nome_casello = nome_casello;
		this.distanza_dal_inizio = distanza_dal_inizio;
	}
	public double getDistanzaInizio() {
		return this.distanza_dal_inizio;
	}

    public String getNome_casello() {
        return nome_casello;
    }
        
}    

