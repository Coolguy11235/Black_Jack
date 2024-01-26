import java.util.Random;

public class Deck extends Hand {

    Random slump = new Random();
    public void fyllning() {

        for (Symboler symboler: Symboler.values()) {
            for (Rang rang: Rang.values()) {
                Kort kort = new Kort(symboler, rang);
                kort.vändKort();
                this.tilläga(kort);
            }
        }
    }

    public void blandning() {
        for (int i = korten.size() - 1; i > 0; i--) {
            int välj = slump.nextInt(i + 1);
            korten.set(i, korten.set(välj, korten.get(i)));
        }
    }

    public void delning(Hand[] händer, int perHand) {
        for (int i = 0; i < perHand; i++) {
            for (int j = 0; j < händer.length; j++) {
                this.ge(korten.get(0), händer[j]);
            }
        }
    }
    public void delning(Hand hand, int perHand) {
        for (int i = 0; i < perHand; i++) {
            this.ge(korten.get(0), hand);
        }
    }
    public void vändKort(Kort k) {
        k.vändKort();
    }
}
