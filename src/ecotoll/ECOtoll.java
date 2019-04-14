
package ecotoll;
import autostrada.*;
import veicolo.*;
/**
 *
 * @author Bryant Sarabia
 */
public class ECOtoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        veicolo macchina = new veicolo("Punto","Fiat","BE102E",2,1998,1.25f,1.50f);
        Autostrada A14 = new Autostrada("A50",false);
        Casello c1 = new Casello("Colledara",250);
        Casello c2 = new Casello("Teramo",312);
        Pedaggio p1 = new Pedaggio();
        Tariffa taf1 = new Tariffa("Classe A",0.06);
        Tariffa taf2 = new Tariffa("Classe B",0.07);
        Tariffa taf3 = new Tariffa("Classe C",0.08);
        Tariffa taf4 = new Tariffa("Classe D",0.09);
        Tariffa taf5 = new Tariffa("Classe E",0.10);
        A14.addCasello(c1);
        A14.addCasello(c2);
        A14.addTariffa(taf1);
        A14.addTariffa(taf2);
        A14.addTariffa(taf3);
        A14.addTariffa(taf4);
        A14.addTariffa(taf5);
        double costo = p1.getCosto(macchina, A14, "Colledara", "Teramo");
        System.out.println(costo);

    }
    
}
