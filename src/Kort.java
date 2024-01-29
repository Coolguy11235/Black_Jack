// Klasset som innehåller kortets attributer och funktioner
public class Kort {

    // Privata fälter
    private Symboler symboler;
    private Rang rang;
    // Säger om kortets framsida är uppe eller inte
    public boolean framsidanUppe;

    // Konstrukturn
    public Kort(Symboler symboler, Rang rang) {
        this.symboler = symboler;
        this.rang = rang;
        framsidanUppe = true;
    }
    // Public metoder
    public String getSymboler() {
        return symboler.printSymboler();
    }
    // Rang som int
    public int getRang() {
        return rang.getRang();
    }
    // Rang som String (gjord för Ess, knekt, dam och kung)
    public String printRang() {
        return rang.printRang();
    }
    // Vänder kort genom att omvända "framsidanUppe" metoden
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
