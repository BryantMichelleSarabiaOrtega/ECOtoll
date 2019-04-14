
package veicolo;

/**
 *
 * @author Bryant Sarabia
 */
public class Classe_A extends veicolo {

    public Classe_A(String modello, String marca, String targa, int anno, float peso, int assi, float altezza) {
        super(modello, marca, targa, anno, peso, assi, altezza);
    }

    public Classe_A(String mod, String mar, String tar, int assi, int anno, float peso, float alt) {
        super(mod, mar, tar, assi, anno, peso, alt);
    }
    
}
