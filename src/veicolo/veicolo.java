
package veicolo;

import java.util.Objects;

/**
 *
 * @author Bryant Sarabia
 */
public class veicolo {
    private String modello,marca,targa;
    private int anno;
    private float peso;
    private int assi;
    private float altezza;
    private int ambientale;

    public veicolo(String modello, String marca, String targa, int anno, float peso, int assi, float altezza) {
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.anno = anno;
        this.peso = peso;
        this.assi = assi;
        this.altezza = altezza;
    }
    
    
    
    public veicolo (String mod, String mar, String tar, int assi, int anno, 
            float peso,float alt){
        this.modello = mod;
        this.marca = mar;
        this.targa = tar;
        this.assi = assi;
        this.anno = anno;
        this.peso = peso;
        this.altezza = alt;
        
    }

    public int getAssi() {
        return assi;
    }

    public void setAssi(byte assi) {
        this.assi = assi;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }
    
    public String getModello(){
        return this.modello;
    }
        
    public String getMarca(){
        return this.marca;
    }    
    
    public String getTarga(){
        return this.targa;
    }
        
    public int getAnno() {
        return anno;
    }

    public float getPeso() {
        return peso;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setAnno(short anno) {
        this.anno = anno;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "veicolo{" + "modello=" + modello + ", marca=" + marca + ", "
                + "targa=" + targa + ", assi=" + assi + ", anno=" + anno + ", "
                + "peso=" + peso + ", altezza=" + altezza + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final veicolo other = (veicolo) obj;
        if (this.anno != other.anno) {
            return false;
        }
        if (Float.floatToIntBits(this.peso) != Float.floatToIntBits(other.peso)) {
            return false;
        }
        if (this.assi != other.assi) {
            return false;
        }
        if (Float.floatToIntBits(this.altezza) != Float.floatToIntBits(other.altezza)) {
            return false;
        }
        if (!Objects.equals(this.modello, other.modello)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.targa, other.targa)) {
            return false;
        }
        return true;
    }
}

    