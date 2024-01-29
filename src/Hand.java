import java.util.ArrayList;

// I princip ett klass för en spelare som innehåller individuella kort
public class Hand {
    // Skapar en lista som kan innehålla några kort
    public ArrayList<Kort> korten;

    // Konstruktorn:
    public Hand() {
        korten = new ArrayList<Kort>();
    }

    // Public metoder:
    // Rensar alla kort i handen
    public void rensa() {
        korten.clear();
    }
    // Lägger till ett kort i handen
    public void tilläga(Kort kort) {
        korten.add(kort);
    }
    // Visar korten och och deras totalpoäng
    // Totalpoängen ser vi bara om alla kortens framsida är uppe
    public String visaHand() {
        boolean allaFramsidanUppe = true;
        String str = "";
        for (Kort k: korten) {
            str += k.tillString() + "\n";
            if (!k.framsidanUppe) {
                allaFramsidanUppe = false;
            }
        }
        // Visar hur många poäng du har om framsidan är uppe
        if (allaFramsidanUppe) {
            str += "Totalt poäng: " + fåTotalt() + "\n";
        }
        return str;
    }
    // Vänder alla kort i handen
    public void vändKorten() {
        for (Kort k: korten) {
            k.vändKort();
        }
    }
    // Låter dig att ge ett kort från en hand till en annan
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
    // Totalpoäng i handen
    public int fåTotalt() {
        int totalPoäng = 0;
        boolean harEss = false;
        // Räknar totalpoäng (Ess som standard är lika med 1)
        for (int i = 0; i < korten.size(); i++) {
            totalPoäng += korten.get(i).getRang();
            // Tittar om det finns ett Ess
            if (korten.get(i).printRang() == "Ess") {
                harEss = true;
            }
            // Gjör att Ess är lika med 11 (10 + 1) om totalpoängen är mindre eller lika med 11
            if (harEss && totalPoäng <= 11) {
                totalPoäng += 10;
            }
        }
        return totalPoäng;
    }
    // Loopa genom alla kort
    public String tillString() {
        String str = "";
        for (Kort kort: korten) {
            str += kort.tillString() + "\n";
        }
        return str;
    }
}
