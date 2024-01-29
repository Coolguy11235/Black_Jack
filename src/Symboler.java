// Klasset som innehåller som skapar alla symboler för kort
public enum Symboler {
    // Alla symboler i String-form
    HJÄRTER("hjärter"),
    RUTER ("ruter"),
    SPADER ("spader"),
    KLÖVER ("Klöver");

    // Privat fält:
    private final String symbolText;

    // Konstruktorn:
    private Symboler (String symbolText) {
        this.symbolText = symbolText;
    }

    // Public metod som matar ut text:
    public String printSymboler() {
        return symbolText;
    }

}
