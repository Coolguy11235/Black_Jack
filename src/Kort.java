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
        // Kortets framsidan är upp från början
        framsidanUppe = true;
    }
    // Public metoder
    public String getSymboler() {
        return symboler.printSymboler();
    }
    public int getRang() {
        return rang.getRang();
    }

    // Matar ut kortet som string om framsidan är uppe
    public String toString() {
        String str = "";
        if (framsidanUppe) {
            str += rang.getRang() + " av " + symboler.printSymboler();
        } else {
            str = "Framsidan är nere, du kan inte se kortet";
        }
        return str;
    }
}
