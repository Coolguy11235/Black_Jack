// Kort klasset
public class Kort {

    // Privata fälter
    private Symboler symboler;
    private Rang rang;
    // Säger om kortets framsida är uppe eller inte
    private boolean framsidanUppe;

    // Konstrukturn
    public Kort(Symboler symboler, Rang rang) {
        this.symboler = symboler;
        this.rang = rang;
        // Kortets framsidan är nere från början
        framsidanUppe = false;
    }
    // Public metoder
    public String getSymboler() {
        return symboler.printSymboler();
    }
    public int getRang() {
        return rang.getRang();
    }
    // Vänder kort
    public void vändKort() {
        framsidanUppe = !framsidanUppe;
    }

    // Matar ut kortet som string om framsidan är uppe
    public String tillString() {
        String str = "";
        if (framsidanUppe) {
            str += rang.printRang() + " " + symboler.printSymboler();
        } else {
            str = "Framsidan är nere, du kan inte se kortet";
        }
        return str;
    }
}
