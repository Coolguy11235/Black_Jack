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
            int välj = slump.nextInt(i);
            Kort slumpKort = korten.get(välj);
            Kort sistaKort = korten.get(i);
            korten.set(i, slumpKort);
            korten.set(välj, sistaKort);
        }
    }
}
