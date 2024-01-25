import java.util.ArrayList;

// Korten som spelaren innehåller
public class Hand {
    private ArrayList<Kort> korten;

    // Konstruktorn
    public Hand() {
        korten = new ArrayList<Kort>();
    }
    public void rensa() {
        korten.clear();
    }
    public void tilläga(Kort kort) {
        korten.add(kort);
    }
    public String visaHand() {
        String str = "";
        for (Kort k: korten) {
            str += k.tillString() + "\n";
        }
        return str;
    }
    public boolean ge(Kort kort, Hand andraHand) {
        if (!korten.contains(kort)) {
            return false;
        } else {
            korten.remove(kort);
            andraHand.tilläga(kort);
            return true;
        }
    }
}
