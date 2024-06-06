package magazzino;

public class Aggiungi extends Thread{
    
    protected int quantita;
    
    public Aggiungi(int quantita){
        this.quantita = quantita;  
    }

    @Override
    public void run() {
        
        Magazzino.ProdottiEffettivi = Magazzino.ProdottiEffettivi + this.quantita;
        
    }
    
}