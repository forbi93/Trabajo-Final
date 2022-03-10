package beans;


public class solicitud {

    private int sol;
    private int enc;
    private int ado;
    private String can;
    private String men;
    private String fech;

    public solicitud(int sol, int enc, int ado, String can, String men, String fech) {
        this.sol = sol;
        this.enc = enc;
        this.ado = ado;
        this.can = can;
        this.men = men;
        this.fech = fech;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public int getEnc() {
        return enc;
    }

    public void setEnc(int enc) {
        this.enc = enc;
    }

    public int getAdo() {
        return ado;
    }

    public void setAdo(int ado) {
        this.ado = ado;
    }

    public String getCan() {
        return can;
    }

    public void setCan(String can) {
        this.can = can;
    }

    public String getMen() {
        return men;
    }

    public void setMen(String men) {
        this.men = men;
    }

    public String getFech() {
        return fech;
    }

    public void setFech(String fech) {
        this.fech = fech;
    }

  

    
    
}

