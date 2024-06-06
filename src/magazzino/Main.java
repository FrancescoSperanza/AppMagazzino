package magazzino;

public class Main {

    public static void main(String[] args) {
        
        Magazzino magazzino = new Magazzino(20);
        
        magazzino.addProdotto(10);
        
        magazzino.removeProdotto(7);
        
        magazzino.stampaProdotti();
        
    }
   
}