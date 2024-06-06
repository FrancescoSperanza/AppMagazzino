package magazzino;

public class Magazzino{
    
    public static int Prodotti;
    
    public static int ProdottiEffettivi;
    
    protected int quantita;
    
    public Magazzino(){
        this.quantita = 1;
        this.Prodotti = 0;
    }
    
    public Magazzino(int numProdotti){
        this.Prodotti = numProdotti;
        this.ProdottiEffettivi = 0;
    }
    
    public void addProdotto(int quantita){
        Aggiungi add = new Aggiungi(quantita);
        add.start();
    }
    
    public void removeProdotto(int quantita){
        Togli remove = new Togli(quantita);
        remove.start();
    }

    public void stampaProdotti(){
        Scrivi stampa = new Scrivi();
        stampa.start();
    }
    
    public int getProdotti() {
        return Prodotti;
    }

    public static int getProdottiEffettivi() {
        return ProdottiEffettivi;
    }

    public int getQuantita() {
        return quantita;
    }
    
}