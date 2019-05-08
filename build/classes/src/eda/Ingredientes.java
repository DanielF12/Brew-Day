package eda;

public class Ingredientes {
    private int maltes;
    private int leveduras;
    private int lupulo;
    private int acucares;
    private String aditivo;
    
    public Ingredientes(int maltes, int leveduras, int lupulo, int acucares, String aditivo){
        this.maltes = maltes;
        this.leveduras = leveduras;
        this.lupulo = lupulo;
        this.acucares = acucares;
        this.aditivo = aditivo;
    }

    public int getMaltes() {
        return maltes;
    }

    public void setMaltes(int maltes) {
        this.maltes = maltes;
    }

    public int getLeveduras() {
        return leveduras;
    }

    public void setLeveduras(int leveduras) {
        this.leveduras = leveduras;
    }

    public int getLupulo() {
        return lupulo;
    }

    public void setLupulo(int lupulo) {
        this.lupulo = lupulo;
    }

    public int getAcucares() {
        return acucares;
    }

    public void setAcucares(int acucares) {
        this.acucares = acucares;
    }

    public String getAditivo() {
        return aditivo;
    }

    public void setAditivo(String aditivo) {
        this.aditivo = aditivo;
    }
    
}
