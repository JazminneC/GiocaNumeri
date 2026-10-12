package giocanumeri;

public class GiocaNumeri {

    public static void main(String[] args) {
        Giocatore g1 = new Giocatore("Monica");
        g1.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Giocatore g2 = new Giocatore("Paolo");
        g2.start();

        try {
            g1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("FINE GIOCO");
    }
}
