public class Persona {
boolean cortar=false;
boolean espera=false;
boolean paga=false;
int tipoCorte = (int) Math.random()*2+1;

    public int getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(int tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public boolean getCortar() {
        return cortar;
    }

    public void setCortar(boolean cortar) {
        this.cortar = cortar;
    }

    public boolean getEspera() {
        return espera;
    }

    public void setEspera(boolean espera) {
        this.espera = espera;
    }

    public boolean getPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
}
