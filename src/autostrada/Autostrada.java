
package autostrada;
import veicolo.veicolo;
import java.util.*;
/**
 *
 * @author Bryant Sarabia
 */
public class Autostrada {
    	private String nome_autostrada;
        private boolean tipo_autostrada; /* Pianura = false, Montagna = true*/
        private  static ArrayList<Casello> lista_caselli = new ArrayList<Casello>();
        private  static ArrayList<Tariffa> lista_tariffa = new ArrayList<Tariffa>();

    public Autostrada(String nome_autostrada, boolean tipo_autostrada) {
        this.nome_autostrada = nome_autostrada; 
        this.tipo_autostrada = tipo_autostrada;
        
    }

    public String getNome_autostrada() {
        return nome_autostrada;
    }

    public boolean getTipo_autostrada() {
        return tipo_autostrada;
    }
    
    public boolean addCasello(Casello c) {
		return lista_caselli.add(c);
	}
	public boolean removeCasello(Casello c) {
		return lista_caselli.remove(c);
}
        
    public boolean addTariffa(Tariffa s){
        return lista_tariffa.add(s);
        
    }
    
    public boolean remove(Tariffa s){
        return lista_tariffa.remove(s);
    }
    
    public static double getTariffaUnitaria(veicolo v){
        if (v.getAssi()==2 && v.getAltezza()<= 1.30){
       for (Tariffa x : lista_tariffa){
           if (x.getClasse().equals("Classe A"))
               return x.getPrezzo();
       }}
        else if (v.getAssi()==2 && v.getAltezza()>1.30){
       for (Tariffa x : lista_tariffa){
           if (x.getClasse().equals("Classe B"))
               return x.getPrezzo();
       }
         }
        else if (v.getAssi()==3){
       for (Tariffa x : lista_tariffa){
           if (x.getClasse().equals("Classe C"))
               return x.getPrezzo();
       }}
        else if (v.getAssi()==4){
       for (Tariffa x : lista_tariffa){
           if (x.getClasse().equals("Class D"))
               return x.getPrezzo();
       }}
        else if (v.getAssi()==5){
       for (Tariffa x : lista_tariffa){
           if (x.getClasse().equals("Classe E"))
               return x.getPrezzo();
       }
        }
        return -1; //errore
    }
    
    public static Casello getCasello(String c){
        Casello p = null;
        for(Casello x : lista_caselli )
            if(x.getNome_casello().equals(c)){
                 p = x;
            }
        return p;
    }
}
