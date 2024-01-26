import java.util.ArrayList;

// Korten som spelaren innehåller
public class Hand {
    public ArrayList<Kort> korten;

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
        boolean allaFramsidanUppe = true;
        String str = "";
        for (Kort k: korten) {
            str += k.tillString() + "\n";
            if (!k.framsidanUppe) {
                allaFramsidanUppe = false;
            }
        }
        if (allaFramsidanUppe) {
            str += "Totalt poäng: " + fåTotalt() + "\n";
        }
        return str;
    }
    public void vändKorten() {
        for (Kort k: korten) {
            k.vändKort();
        }
    }
    public boolean ge(Kort kort, Hand andraHand) {
        if (korten.contains(kort)) {
            int i = korten.indexOf(kort);
            korten.remove(i);
            andraHand.tilläga(kort);
            return true;
        } else {
            return false;
        }
    }
    public int fåTotalt() {
        int totalPoäng = 0;
        boolean harEss = false;
        for (int i = 0; i < korten.size(); i++) {
            totalPoäng += korten.get(i).getRang();
            if (korten.get(i).printRang() == "Ess") {
                harEss = true;
            }
            if (harEss && totalPoäng <= 11) {
                totalPoäng += 10;
            }
        }
        return totalPoäng;
    }

    public String tillString() {
        String str = "";
        for (Kort kort: korten) {
            str += kort.tillString() + "\n";
        }
        return str;
    }
}
