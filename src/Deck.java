import java.util.Random;

// Klasset Deck föreställer bordet där spelet pågår
public class Deck extends Hand {

    // Genererar Random funktionen
    Random slump = new Random();

    // Public metoder:
    // Skapar alla variationer av kort genom att lägga till alla rang i alla symboler
    public void fyllning() {
        for (Symboler symboler: Symboler.values()) {
            for (Rang rang: Rang.values()) {
                Kort kort = new Kort(symboler, rang);
                kort.vändKort();
                this.tilläga(kort);
            }
        }
    }
    // Blandar alla kort som finns i decken
    public void blandning() {
        for (int i = korten.size() - 1; i > 0; i--) {
            // Byter ett slump kort mellan den första och sista kortet i loopen
            int välj = slump.nextInt(i + 1);
            korten.set(i, korten.set(välj, korten.get(i)));
        }
    }
    // Delar ut kort till några händer
    public void delning(Hand[] händer, int perHand) {
        for (int i = 0; i < perHand; i++) {
            for (int j = 0; j < händer.length; j++) {
                this.ge(korten.get(0), händer[j]);
            }
        }
    }
    // Delar ut kort till en hand
    public void delning(Hand hand, int perHand) {
        for (int i = 0; i < perHand; i++) {
            this.ge(korten.get(0), hand);
        }
    }
    // Vänder alla kort i decken
    public void vändKort(Kort k) {
        k.vändKort();
    }
}
