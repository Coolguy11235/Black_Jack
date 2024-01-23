// Symbolerna
public enum Symboler {
    HJÄRTER("hjärter"),
    RUTER ("ruter"),
    SPADER ("spader"),
    KLÖVER ("Klöver");

    // Privat fält
    private final String symbolText;

    // Konstruktorn
    private Symboler (String symbolText) {
        this.symbolText = symbolText;
    }

    // Public metod som matar ut text
    public String printSymboler() {
        return symbolText;
    }

}
