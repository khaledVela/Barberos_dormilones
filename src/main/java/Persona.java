public class Persona {
boolean cortar=false;
boolean espera=false;
boolean paga=false;
int tiempo= (int) Math.random()*10;

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
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

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
}
