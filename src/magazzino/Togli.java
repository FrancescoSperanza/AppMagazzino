package magazzino;

public class Togli extends Thread{
    
    protected int quantita;
    
    public Togli(int quantita){
        
        this.quantita = quantita;
        
    }

    @Override
    public void run() {
        
        Magazzino.ProdottiEffettivi = Magazzino.ProdottiEffettivi - this.quantita;
        
    }
    
}