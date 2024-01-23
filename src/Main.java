public class Main {
    public static void main(String[] args) {
        Kort k1, k2;

        k1 = new Kort(Symboler.HJÄRTER, Rang.ESS);
        k2 = new Kort(Symboler.HJÄRTER, Rang.KNEKT);

        // Vända korten
        k1.vändKort();
        k2.vändKort();

        if (k1.getRang() > k2.getRang()) {
            System.out.println(k1.toString() + " är större än " + k2.toString());
        } else {
            System.out.println(k1.toString() + " är inte större än " + k2.toString());
        }

        if (k1.getRang() == k2.getRang()) {
            System.out.println(k1.toString() + " är lika med " + k2.toString());
        } else {
            System.out.println(k1.toString() + " är inte lika med " + k2.toString());
        }

        if (k1.getRang() < k2.getRang()) {
            System.out.println(k1.toString() + " är mindre än " + k2.toString());
        } else {
            System.out.println(k1.toString() + " är inte mindre än " + k2.toString());
        }
    }
}