
package Modelo;

public class Persona {
    int id;
    String dni;
    String nom;
    String ape;
    String cel;
    String ema;
    String di1;
    String di2;
    String par;
    String can;
    String pro;
    Boolean est;
    String dia;
    String exa;
    String ana;
    String com;
    String fe1;
    String fe2;




    public Persona() {
    }

    public Persona(String dni, String nom,String ape, String cel, String ema, String di1, String di2, String par, String can, String pro, Boolean est, String dia, String exa, String ana, String com, String fe1, String fe2) {
        this.dni = dni;
        this.nom = nom;
        this.ape = ape;
        this.cel= cel;
        this.ema = ema;
        this.di1 = di1;
        this.di2= di2;
        
        this.par = par;
        this.can = can;
        this.pro = pro;
        this.est= est;
        this.dia = dia;
        this.exa = exa;
        this.ana= ana;
        this.com = com;
        this.fe1 = fe1;
        this.fe2= fe2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }
     public String getCel() {
        return cel;
    }

    public void setCel(String cel ) {
        this.cel = cel;
    }
    
    
     public String getEma() {
        return ema;
    }

    public void setEma(String ema) {
        this.ema = ema;
    }

    public String getDi1() {
        return di1;
    }

    public void setDi1(String di1) {
        this.di1 = di1;
    }
    public String getDi2() {
        return di2;
    }

    public void setDi2(String di2) {
        this.di2 = di2;
    }
     public String getPar() {
        return par;
    }

    public void setPar(String par ) {
        this.par = par;
    }
    
    public String getCan() {
        return can;
    }

    public void setCan(String can ) {
        this.can = can;
    }
    public String getPro() {
        return pro;
    }

    public void setPro(String pro ) {
        this.pro = pro;
    }
     public Boolean getEst() {
        return est;
    }

    public void setEst(Boolean est) {
        this.est = est;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getExa() {
        return exa;
    }

    public void setExa(String exa) {
        this.exa = exa;
    }
     public String getAna() {
        return ana;
    }

    public void setAna(String ana ) {
        this.ana = ana;
    }
    
     public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getFe1() {
        return fe1;
    }

    public void setFe1(String fe1) {
        this.fe1 = fe1;
    }
    public String getFe2() {
        return fe2;
    }

    public void setFe2(String fe2) {
        this.fe2 = fe2;
    }
    
}
