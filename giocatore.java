package giocanumeri;

public class Giocatore extends Thread {

    String nome;
    int punteggio;
    String parola = "";

    public Giocatore(String nome) {
        this.nome = nome;
    }

    public void gioca() {
        int numero = 19;
        String parole = "Buongiorno";

        setParola(parole);

        for (int i = 0; i < numero; i++) {
            System.out.println("Giocatore " + nome + ": " + i);

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Errore nella transizione running-sleeping");
            }

            Thread.yield();
        }

        setPunteggio(100);

        System.out.println("Giocatore: " + nome
                + " parola: " + getParola()
                + " punteggio: " + getPunteggio());
    }

    public void comunica() {
        System.out.println("Giocatore " + nome
                + ": " + punteggio
                + " ha scelto la parola: " + parola);
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    @Override
    public void run() {
        gioca();
    }
}
