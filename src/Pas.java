public class Pas {
    String ime;
    int godine;
    String rasa;
    String boja;
    String velicina;
    String vlasnik;
    boolean pelcovan = false;

    public Pas() {
    }

    public void setIme(String imePas) {
        ime = imePas;
    }

    public String getIme() {
        return ime;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public boolean isPelcovan() {
        return pelcovan;
    }

    public void setPelcovan() {
        this.pelcovan = pelcovan;
    }

    public Pas(String ime, int godine, String rasa, String boja, String velicina, String vlasnik) {
        this.ime = ime;
        this.godine = godine;
        this.rasa = rasa;
        this.boja = boja;
        this.velicina = velicina;
        this.vlasnik = vlasnik;
        System.out.println(this);

    }
}