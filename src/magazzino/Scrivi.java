package magazzino;

public class Scrivi extends Thread{

    @Override
    public String toString() {
        return "Spazio in Magazino:\t" + Magazzino.ProdottiEffettivi + " su " + Magazzino.Prodotti;
    }

    @Override
    public void run() {
        System.out.println(toString());
    }
    
}